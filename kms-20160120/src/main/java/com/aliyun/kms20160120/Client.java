// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120;

import com.aliyun.tea.*;
import com.aliyun.kms20160120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("kms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists supported encryption algorithms. 
      * | KeySpec | Algorithm | Description | Maximum length in bytes |
      * | ------- | --------- | ----------- | ----------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 256 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 256 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 384 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 384 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6144 |
      * In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the decryption algorithm `RSAES_OAEP_SHA_1` are used to decrypt the ciphertext `BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==`.
      *
      * @param request AsymmetricDecryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AsymmetricDecryptResponse
     */
    public AsymmetricDecryptResponse asymmetricDecryptWithOptions(AsymmetricDecryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsymmetricDecrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsymmetricDecryptResponse());
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists supported encryption algorithms. 
      * | KeySpec | Algorithm | Description | Maximum length in bytes |
      * | ------- | --------- | ----------- | ----------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 256 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 256 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 384 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 384 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6144 |
      * In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the decryption algorithm `RSAES_OAEP_SHA_1` are used to decrypt the ciphertext `BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==`.
      *
      * @param request AsymmetricDecryptRequest
      * @return AsymmetricDecryptResponse
     */
    public AsymmetricDecryptResponse asymmetricDecrypt(AsymmetricDecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricDecryptWithOptions(request, runtime);
    }

    /**
      * This operation is supported only for asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists the supported encryption algorithms: 
      * | KeySpec | Algorithm | Description | Maximum number of bytes that can be encrypted |
      * | ------- | --------- | ----------- | --------------------------------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 190 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 214 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 318 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 342 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6047 |
      * You can use the asymmetric CMK whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the algorithm `RSAES_OAEP_SHA_1` to encrypt the plaintext `SGVsbG8gd29ybGQ=` based on the parameter settings provided in this topic.
      *
      * @param request AsymmetricEncryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AsymmetricEncryptResponse
     */
    public AsymmetricEncryptResponse asymmetricEncryptWithOptions(AsymmetricEncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plaintext)) {
            query.put("Plaintext", request.plaintext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsymmetricEncrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsymmetricEncryptResponse());
    }

    /**
      * This operation is supported only for asymmetric keys for which the **Usage** parameter is set to **ENCRYPT/DECRYPT**. The following table lists the supported encryption algorithms: 
      * | KeySpec | Algorithm | Description | Maximum number of bytes that can be encrypted |
      * | ------- | --------- | ----------- | --------------------------------------------- |
      * | RSA_2048 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 190 |
      * | RSA_2048 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 214 |
      * | RSA_3072 | RSAES_OAEP_SHA_256 | RSAES-OAEP using SHA-256 and MGF1 with SHA-256 | 318 |
      * | RSA_3072 | RSAES_OAEP_SHA_1 | RSAES-OAEP using SHA1 and MGF1 with SHA1 | 342 |
      * | EC_SM2 | SM2PKE | SM2 public key encryption algorithm based on elliptic curves | 6047 |
      * You can use the asymmetric CMK whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the algorithm `RSAES_OAEP_SHA_1` to encrypt the plaintext `SGVsbG8gd29ybGQ=` based on the parameter settings provided in this topic.
      *
      * @param request AsymmetricEncryptRequest
      * @return AsymmetricEncryptResponse
     */
    public AsymmetricEncryptResponse asymmetricEncrypt(AsymmetricEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricEncryptWithOptions(request, runtime);
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **SIGN/VERIFY**. The following table describes the supported signature algorithms. 
      * | KeySpec | Algorithm | Description |
      * | ------- | --------- | ----------- |
      * | RSA_2048 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_2048 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | RSA_3072 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_3072 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | EC_P256 | ECDSA_SHA_256 | ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest |
      * | EC_P256K | ECDSA_SHA_256 | ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest |
      * | EC_SM2 | SM2DSA | SM2 public key encryption algorithm based on elliptic curves cryptography (ECC) |
      * >  According to GB/T 32918.2 "Information security technology-Public key cryptographic algorithm SM2 based on elliptic curves-Part 2: Digital signature algorithm", when you calculate the SM2 signature, the **Digest** parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T GB/T 32918.2. In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the signature algorithm `RSA_PSS_SHA_256` are used to generate a signature for the digest `ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=`.
      *
      * @param request AsymmetricSignRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AsymmetricSignResponse
     */
    public AsymmetricSignResponse asymmetricSignWithOptions(AsymmetricSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsymmetricSign"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsymmetricSignResponse());
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **SIGN/VERIFY**. The following table describes the supported signature algorithms. 
      * | KeySpec | Algorithm | Description |
      * | ------- | --------- | ----------- |
      * | RSA_2048 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_2048 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | RSA_3072 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_3072 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | EC_P256 | ECDSA_SHA_256 | ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest |
      * | EC_P256K | ECDSA_SHA_256 | ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest |
      * | EC_SM2 | SM2DSA | SM2 public key encryption algorithm based on elliptic curves cryptography (ECC) |
      * >  According to GB/T 32918.2 "Information security technology-Public key cryptographic algorithm SM2 based on elliptic curves-Part 2: Digital signature algorithm", when you calculate the SM2 signature, the **Digest** parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T GB/T 32918.2. In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the signature algorithm `RSA_PSS_SHA_256` are used to generate a signature for the digest `ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=`.
      *
      * @param request AsymmetricSignRequest
      * @return AsymmetricSignResponse
     */
    public AsymmetricSignResponse asymmetricSign(AsymmetricSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricSignWithOptions(request, runtime);
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **SIGN/VERIFY**. The following table describes the supported signature algorithms. 
      * | KeySpec | Algorithm | Description |
      * | ------- | --------- | ----------- |
      * | RSA_2048 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_2048 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | RSA_3072 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_3072 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | EC_P256 | ECDSA_SHA_256 | ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest |
      * | EC_P256K | ECDSA_SHA_256 | ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest |
      * | EC_SM2 | SM2DSA | SM2 elliptic curve public key encryption algorithm |
      * >  When you calculate the SM2 signature based on GB/T 32918, the **Digest** parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature `M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==` of the digest `ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=`.
      *
      * @param request AsymmetricVerifyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AsymmetricVerifyResponse
     */
    public AsymmetricVerifyResponse asymmetricVerifyWithOptions(AsymmetricVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsymmetricVerify"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsymmetricVerifyResponse());
    }

    /**
      * This operation supports only asymmetric keys for which the **Usage** parameter is set to **SIGN/VERIFY**. The following table describes the supported signature algorithms. 
      * | KeySpec | Algorithm | Description |
      * | ------- | --------- | ----------- |
      * | RSA_2048 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_2048 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | RSA_3072 | RSA_PSS_SHA_256 | RSASSA-PSS using SHA-256 and MGF1 with SHA-256 |
      * | RSA_3072 | RSA_PKCS1_SHA_256 | RSASSA-PKCS1-v1_5 using SHA-256 |
      * | EC_P256 | ECDSA_SHA_256 | ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest |
      * | EC_P256K | ECDSA_SHA_256 | ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest |
      * | EC_SM2 | SM2DSA | SM2 elliptic curve public key encryption algorithm |
      * >  When you calculate the SM2 signature based on GB/T 32918, the **Digest** parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is `5c438b18-05be-40ad-b6c2-3be6752c****` and version ID is `2ab1a983-7072-4bbc-a582-584b5bd8****` and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature `M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==` of the digest `ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=`.
      *
      * @param request AsymmetricVerifyRequest
      * @return AsymmetricVerifyResponse
     */
    public AsymmetricVerifyResponse asymmetricVerify(AsymmetricVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricVerifyWithOptions(request, runtime);
    }

    /**
      * If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.
      *
      * @param request CancelKeyDeletionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CancelKeyDeletionResponse
     */
    public CancelKeyDeletionResponse cancelKeyDeletionWithOptions(CancelKeyDeletionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelKeyDeletion"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelKeyDeletionResponse());
    }

    /**
      * If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.
      *
      * @param request CancelKeyDeletionRequest
      * @return CancelKeyDeletionResponse
     */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelKeyDeletionWithOptions(request, runtime);
    }

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to decrypt the data `ZOyIygCyaOW6Gj****MlNKiuyjfzw=`.
      *
      * @param request CertificatePrivateKeyDecryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CertificatePrivateKeyDecryptResponse
     */
    public CertificatePrivateKeyDecryptResponse certificatePrivateKeyDecryptWithOptions(CertificatePrivateKeyDecryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CertificatePrivateKeyDecrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertificatePrivateKeyDecryptResponse());
    }

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to decrypt the data `ZOyIygCyaOW6Gj****MlNKiuyjfzw=`.
      *
      * @param request CertificatePrivateKeyDecryptRequest
      * @return CertificatePrivateKeyDecryptResponse
     */
    public CertificatePrivateKeyDecryptResponse certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePrivateKeyDecryptWithOptions(request, runtime);
    }

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to generate a signature for the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePrivateKeySignRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CertificatePrivateKeySignResponse
     */
    public CertificatePrivateKeySignResponse certificatePrivateKeySignWithOptions(CertificatePrivateKeySignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CertificatePrivateKeySign"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertificatePrivateKeySignResponse());
    }

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to generate a signature for the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePrivateKeySignRequest
      * @return CertificatePrivateKeySignResponse
     */
    public CertificatePrivateKeySignResponse certificatePrivateKeySign(CertificatePrivateKeySignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePrivateKeySignWithOptions(request, runtime);
    }

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to encrypt the data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePublicKeyEncryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CertificatePublicKeyEncryptResponse
     */
    public CertificatePublicKeyEncryptResponse certificatePublicKeyEncryptWithOptions(CertificatePublicKeyEncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plaintext)) {
            query.put("Plaintext", request.plaintext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CertificatePublicKeyEncrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertificatePublicKeyEncryptResponse());
    }

    /**
      * Limit: The encryption algorithm in the request parameters must match the key type. 
      * The following table describes the mapping between encryption algorithms and key types.
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSAES_OAEP_SHA_1 | RSA_2048 |
      * | RSAES_OAEP_SHA_256 | RSA_2048 |
      * | SM2PKE | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the encryption algorithm `RSAES_OAEP_SHA_256` are used to encrypt the data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePublicKeyEncryptRequest
      * @return CertificatePublicKeyEncryptResponse
     */
    public CertificatePublicKeyEncryptResponse certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePublicKeyEncryptWithOptions(request, runtime);
    }

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to verify the digital signature `ZOyIygCyaOW6Gj****MlNKiuyjfzw=` of the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePublicKeyVerifyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CertificatePublicKeyVerifyResponse
     */
    public CertificatePublicKeyVerifyResponse certificatePublicKeyVerifyWithOptions(CertificatePublicKeyVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureValue)) {
            query.put("SignatureValue", request.signatureValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CertificatePublicKeyVerify"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CertificatePublicKeyVerifyResponse());
    }

    /**
      * The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  
      * | Algorithm | Key Spec |
      * | --------- | -------- |
      * | RSA_PKCS1_SHA_256 | RSA_2048 |
      * | RSA_PSS_SHA_256 | RSA_2048 |
      * | ECDSA_SHA_256 | EC_P256 |
      * | SM2DSA | EC_SM2 |
      * In this example, the certificate whose ID is `12345678-1234-1234-1234-12345678****` and the signature algorithm `ECDSA_SHA_256` are used to verify the digital signature `ZOyIygCyaOW6Gj****MlNKiuyjfzw=` of the raw data `VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=`.
      *
      * @param request CertificatePublicKeyVerifyRequest
      * @return CertificatePublicKeyVerifyResponse
     */
    public CertificatePublicKeyVerifyResponse certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePublicKeyVerifyWithOptions(request, runtime);
    }

    /**
      * *   Each alias can be bound to only one CMK at a time.
      * *   The aliases of CMKs in the same region must be unique.
      * In this topic, an alias named `alias/example` is created for a CMK named `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
      * @param request CreateAliasRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAliasResponse
     */
    public CreateAliasResponse createAliasWithOptions(CreateAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlias"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAliasResponse());
    }

    /**
      * *   Each alias can be bound to only one CMK at a time.
      * *   The aliases of CMKs in the same region must be unique.
      * In this topic, an alias named `alias/example` is created for a CMK named `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
      * @param request CreateAliasRequest
      * @return CreateAliasResponse
     */
    public CreateAliasResponse createAlias(CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAliasWithOptions(request, runtime);
    }

    /**
      * To create a certificate, you must specify the type of the asymmetric key. Certificates Manager generates a private key and returns a certificate signing request (CSR). Submit the CSR in the Privacy Enhanced Mail (PEM) format to a certificate authority (CA) to obtain the formal certificate and certificate chain. Then, call the [UploadCertificate](~~212136~~) operation to import the certificate into Certificates Manager.
      * In this example, a certificate is created and the CSR is obtained.
      *
      * @param tmpReq CreateCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificateWithOptions(CreateCertificateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCertificateShrinkRequest request = new CreateCertificateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subjectAlternativeNames)) {
            request.subjectAlternativeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subjectAlternativeNames, "SubjectAlternativeNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportablePrivateKey)) {
            query.put("ExportablePrivateKey", request.exportablePrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySpec)) {
            query.put("KeySpec", request.keySpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subjectAlternativeNamesShrink)) {
            query.put("SubjectAlternativeNames", request.subjectAlternativeNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCertificate"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertificateResponse());
    }

    /**
      * To create a certificate, you must specify the type of the asymmetric key. Certificates Manager generates a private key and returns a certificate signing request (CSR). Submit the CSR in the Privacy Enhanced Mail (PEM) format to a certificate authority (CA) to obtain the formal certificate and certificate chain. Then, call the [UploadCertificate](~~212136~~) operation to import the certificate into Certificates Manager.
      * In this example, a certificate is created and the CSR is obtained.
      *
      * @param request CreateCertificateRequest
      * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertificateWithOptions(request, runtime);
    }

    /**
      * A CMK can be symmetric or asymmetric. Symmetric CMKs are used to generate data keys that can be used to encrypt large amounts of data. You can also use symmetric CMKs to encrypt small volume of data that is less than 6 KB. For more information, see [GenerateDataKey](https://www.alibabacloud.com/help/en/key-management-service/latest/generatedatakey). Asymmetric CMKs are used to encrypt data, decrypt data, generate digital signatures, and verify digital signatures. However, you cannot use asymmetric CMKs to generate data keys.  
      * The following table describes different types of CMKs and the operations that are supported by the CMKs. 
      * | CMK category | CMK type | Description | Encryption and decryption | Signature generation and verification |
      * | ------------ | -------- | ----------- | ------------------------- | ------------------------------------- |
      * | Symmetric CMK | Aliyun_AES_256 | An advanced Encryption Standard (AES) CMK with a length of 256 bits. | Yes | No |
      * | Symmetric CMK | Aliyun_AES_128 | An AES CMK with a length of 128 bits. Only Dedicated KMS supports this CMK type. | Yes | No |
      * | Symmetric CMK | Aliyun_AES_192 | An AES CMK with a length of 192 bits. Only Dedicated KMS supports this CMK type. | Yes | No |
      * | Symmetric CMK | Aliyun_SM4 | SM4 CMK. | Yes | No |
      * | Asymmetric CMK | RSA_2048 | Rivest-Shamir-Adleman (RSA) CMK with a length of 2,048 bits. | Supported | Supported |
      * | Asymmetric CMK | RSA_3072 | RSA CMK with a length of 3,072 bits. | Supported | Supported |
      * | Asymmetric CMK | EC_P256 | National Institute of Standards and Technology (NIST)-recommended elliptic curve P-256 (secp256r1). | Not supported | Supported |
      * | Asymmetric CMK | EC_P256K | Standards for Efficient Cryptography Group (SECG) elliptic curve secp256k1 | Not supported | Supported |
      * | Asymmetric CMK | EC_SM2 | 256-bit elliptic curves over the prime field that is defined in GB/T 32918. | Supported | Supported |
      * > - If the value of the KeySpec parameter that is used to create a symmetric CMK is prefixed with `Aliyun_`, a standard cryptographic algorithm is used, but non-standard ciphertext is generated. An asymmetric CMK can be used to generate standard ciphertext or signatures.
      * - You can use an RSA CMK to perform one of the two types of operations: encrypt and decrypt data, and generate and verify signatures. You cannot use the RSA CMK to perform both two types of operations.
      *
      * @param request CreateKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateKeyResponse
     */
    public CreateKeyResponse createKeyWithOptions(CreateKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DKMSInstanceId)) {
            query.put("DKMSInstanceId", request.DKMSInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomaticRotation)) {
            query.put("EnableAutomaticRotation", request.enableAutomaticRotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySpec)) {
            query.put("KeySpec", request.keySpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyUsage)) {
            query.put("KeyUsage", request.keyUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionLevel)) {
            query.put("ProtectionLevel", request.protectionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationInterval)) {
            query.put("RotationInterval", request.rotationInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyResponse());
    }

    /**
      * A CMK can be symmetric or asymmetric. Symmetric CMKs are used to generate data keys that can be used to encrypt large amounts of data. You can also use symmetric CMKs to encrypt small volume of data that is less than 6 KB. For more information, see [GenerateDataKey](https://www.alibabacloud.com/help/en/key-management-service/latest/generatedatakey). Asymmetric CMKs are used to encrypt data, decrypt data, generate digital signatures, and verify digital signatures. However, you cannot use asymmetric CMKs to generate data keys.  
      * The following table describes different types of CMKs and the operations that are supported by the CMKs. 
      * | CMK category | CMK type | Description | Encryption and decryption | Signature generation and verification |
      * | ------------ | -------- | ----------- | ------------------------- | ------------------------------------- |
      * | Symmetric CMK | Aliyun_AES_256 | An advanced Encryption Standard (AES) CMK with a length of 256 bits. | Yes | No |
      * | Symmetric CMK | Aliyun_AES_128 | An AES CMK with a length of 128 bits. Only Dedicated KMS supports this CMK type. | Yes | No |
      * | Symmetric CMK | Aliyun_AES_192 | An AES CMK with a length of 192 bits. Only Dedicated KMS supports this CMK type. | Yes | No |
      * | Symmetric CMK | Aliyun_SM4 | SM4 CMK. | Yes | No |
      * | Asymmetric CMK | RSA_2048 | Rivest-Shamir-Adleman (RSA) CMK with a length of 2,048 bits. | Supported | Supported |
      * | Asymmetric CMK | RSA_3072 | RSA CMK with a length of 3,072 bits. | Supported | Supported |
      * | Asymmetric CMK | EC_P256 | National Institute of Standards and Technology (NIST)-recommended elliptic curve P-256 (secp256r1). | Not supported | Supported |
      * | Asymmetric CMK | EC_P256K | Standards for Efficient Cryptography Group (SECG) elliptic curve secp256k1 | Not supported | Supported |
      * | Asymmetric CMK | EC_SM2 | 256-bit elliptic curves over the prime field that is defined in GB/T 32918. | Supported | Supported |
      * > - If the value of the KeySpec parameter that is used to create a symmetric CMK is prefixed with `Aliyun_`, a standard cryptographic algorithm is used, but non-standard ciphertext is generated. An asymmetric CMK can be used to generate standard ciphertext or signatures.
      * - You can use an RSA CMK to perform one of the two types of operations: encrypt and decrypt data, and generate and verify signatures. You cannot use the RSA CMK to perform both two types of operations.
      *
      * @param request CreateKeyRequest
      * @return CreateKeyResponse
     */
    public CreateKeyResponse createKey(CreateKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyWithOptions(request, runtime);
    }

    /**
      * *   You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the [CreateKey](~~28947~~) operation to create an asymmetric CMK and the [DescribeKey](~~28952~~) operation to query the status of the CMK. The status is specified by the KeyState parameter.
      * *   The minimum interval for creating a version of the same CMK is seven days. You can call the [DescribeKey](~~28952~~) operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.
      * *   If a CMK is in a private key store, you cannot create a version for the CMK.
      * *   You can create a maximum of 50 versions for a CMK in the same region.
      * You can create a version for the CMK whose ID is `0b30658a-ed1a-4922-b8f7-a673ca9c****` by using the parameter settings provided in this topic.
      *
      * @param request CreateKeyVersionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateKeyVersionResponse
     */
    public CreateKeyVersionResponse createKeyVersionWithOptions(CreateKeyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyVersion"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyVersionResponse());
    }

    /**
      * *   You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the [CreateKey](~~28947~~) operation to create an asymmetric CMK and the [DescribeKey](~~28952~~) operation to query the status of the CMK. The status is specified by the KeyState parameter.
      * *   The minimum interval for creating a version of the same CMK is seven days. You can call the [DescribeKey](~~28952~~) operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.
      * *   If a CMK is in a private key store, you cannot create a version for the CMK.
      * *   You can create a maximum of 50 versions for a CMK in the same region.
      * You can create a version for the CMK whose ID is `0b30658a-ed1a-4922-b8f7-a673ca9c****` by using the parameter settings provided in this topic.
      *
      * @param request CreateKeyVersionRequest
      * @return CreateKeyVersionResponse
     */
    public CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyVersionWithOptions(request, runtime);
    }

    /**
      * You must specify the secret name, the secret value that is stored in the initial version, and the version number. The initial version is labeled as ACSCurrent.
      * You can specify a symmetric customer master key (CMK) as the encryption key to encrypt the secret value. If you do not specify an encryption key, Secrets Manager creates a CMK to encrypt the secret value. This CMK is used as the default encryption key for all secrets that are created by your Alibaba Cloud account in the current region. Secrets Manager encrypts only the secret value of each version. Secrets Manager does not encrypt the metadata such as the secret name, version number, or state label.
      * To use a specified CMK to encrypt the secret value, you must have the `kms:GenerateDataKey` permission on the CMK.
      * In this example, a generic secret named `mydbconninfo` is created. The initial version number of the secret is specified in the `VersionId` parameter, and the value is `v1`. The secret value is specified in the `SecretData` parameter, and the value is `{"user":"root","passwd":"****"}`.
      *
      * @param tmpReq CreateSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecretWithOptions(CreateSecretRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecretShrinkRequest request = new CreateSecretShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendedConfig)) {
            request.extendedConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendedConfig, "ExtendedConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DKMSInstanceId)) {
            query.put("DKMSInstanceId", request.DKMSInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomaticRotation)) {
            query.put("EnableAutomaticRotation", request.enableAutomaticRotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKeyId)) {
            query.put("EncryptionKeyId", request.encryptionKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedConfigShrink)) {
            query.put("ExtendedConfig", request.extendedConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationInterval)) {
            query.put("RotationInterval", request.rotationInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretData)) {
            query.put("SecretData", request.secretData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretDataType)) {
            query.put("SecretDataType", request.secretDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretType)) {
            query.put("SecretType", request.secretType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecretResponse());
    }

    /**
      * You must specify the secret name, the secret value that is stored in the initial version, and the version number. The initial version is labeled as ACSCurrent.
      * You can specify a symmetric customer master key (CMK) as the encryption key to encrypt the secret value. If you do not specify an encryption key, Secrets Manager creates a CMK to encrypt the secret value. This CMK is used as the default encryption key for all secrets that are created by your Alibaba Cloud account in the current region. Secrets Manager encrypts only the secret value of each version. Secrets Manager does not encrypt the metadata such as the secret name, version number, or state label.
      * To use a specified CMK to encrypt the secret value, you must have the `kms:GenerateDataKey` permission on the CMK.
      * In this example, a generic secret named `mydbconninfo` is created. The initial version number of the secret is specified in the `VersionId` parameter, and the value is `v1`. The secret value is specified in the `SecretData` parameter, and the value is `{"user":"root","passwd":"****"}`.
      *
      * @param request CreateSecretRequest
      * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretWithOptions(request, runtime);
    }

    public DecryptResponse decryptWithOptions(DecryptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DecryptShrinkRequest request = new DecryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Decrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecryptResponse());
    }

    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    public DeleteAliasResponse deleteAliasWithOptions(DeleteAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlias"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAliasResponse());
    }

    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAliasWithOptions(request, runtime);
    }

    /**
      * After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` and its private key and certificate chain are deleted.
      *
      * @param request DeleteCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificateWithOptions(DeleteCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCertificate"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCertificateResponse());
    }

    /**
      * After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` and its private key and certificate chain are deleted.
      *
      * @param request DeleteCertificateRequest
      * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateWithOptions(request, runtime);
    }

    /**
      * This operation does not delete the CMK that is created by using the key material.
      * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
      * After you delete the key material, you can upload only the same key material into the CMK.
      *
      * @param request DeleteKeyMaterialRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteKeyMaterialResponse
     */
    public DeleteKeyMaterialResponse deleteKeyMaterialWithOptions(DeleteKeyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyMaterial"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyMaterialResponse());
    }

    /**
      * This operation does not delete the CMK that is created by using the key material.
      * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
      * After you delete the key material, you can upload only the same key material into the CMK.
      *
      * @param request DeleteKeyMaterialRequest
      * @return DeleteKeyMaterialResponse
     */
    public DeleteKeyMaterialResponse deleteKeyMaterial(DeleteKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyMaterialWithOptions(request, runtime);
    }

    /**
      * If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
      * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.
      *
      * @param request DeleteSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecretWithOptions(DeleteSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDeleteWithoutRecovery)) {
            query.put("ForceDeleteWithoutRecovery", request.forceDeleteWithoutRecovery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryWindowInDays)) {
            query.put("RecoveryWindowInDays", request.recoveryWindowInDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretResponse());
    }

    /**
      * If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
      * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.
      *
      * @param request DeleteSecretRequest
      * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretWithOptions(request, runtime);
    }

    public DescribeAccountKmsStatusResponse describeAccountKmsStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountKmsStatus"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountKmsStatusResponse());
    }

    public DescribeAccountKmsStatusResponse describeAccountKmsStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountKmsStatusWithOptions(runtime);
    }

    /**
      * In this example, the information about the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.
      *
      * @param request DescribeCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeCertificateResponse
     */
    public DescribeCertificateResponse describeCertificateWithOptions(DescribeCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertificate"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertificateResponse());
    }

    /**
      * In this example, the information about the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.
      *
      * @param request DescribeCertificateRequest
      * @return DescribeCertificateResponse
     */
    public DescribeCertificateResponse describeCertificate(DescribeCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificateWithOptions(request, runtime);
    }

    /**
      * You can query the information about the CMK `05754286-3ba2-4fa6-8d41-4323aca6****` by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
      *
      * @param request DescribeKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeKeyResponse
     */
    public DescribeKeyResponse describeKeyWithOptions(DescribeKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyResponse());
    }

    /**
      * You can query the information about the CMK `05754286-3ba2-4fa6-8d41-4323aca6****` by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
      *
      * @param request DescribeKeyRequest
      * @return DescribeKeyResponse
     */
    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the information about a version of the CMK `1234abcd-12ab-34cd-56ef-12345678****`. The ID of the CMK version is `2ab1a983-7072-4bbc-a582-584b5bd8****`. The response shows that the creation time of the CMK version is `2016-03-25T10:42:40Z`.
      *
      * @param request DescribeKeyVersionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeKeyVersionResponse
     */
    public DescribeKeyVersionResponse describeKeyVersionWithOptions(DescribeKeyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKeyVersion"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyVersionResponse());
    }

    /**
      * This topic provides an example on how to query the information about a version of the CMK `1234abcd-12ab-34cd-56ef-12345678****`. The ID of the CMK version is `2ab1a983-7072-4bbc-a582-584b5bd8****`. The response shows that the creation time of the CMK version is `2016-03-25T10:42:40Z`.
      *
      * @param request DescribeKeyVersionRequest
      * @return DescribeKeyVersionResponse
     */
    public DescribeKeyVersionResponse describeKeyVersion(DescribeKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyVersionWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
      * This operation returns the metadata of a secret. This operation does not return the secret value.
      * In this example, the metadata of the secret named `secret001` is queried.
      *
      * @param request DescribeSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeSecretResponse
     */
    public DescribeSecretResponse describeSecretWithOptions(DescribeSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchTags)) {
            query.put("FetchTags", request.fetchTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecretResponse());
    }

    /**
      * This operation returns the metadata of a secret. This operation does not return the secret value.
      * In this example, the metadata of the secret named `secret001` is queried.
      *
      * @param request DescribeSecretRequest
      * @return DescribeSecretResponse
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecretWithOptions(request, runtime);
    }

    /**
      * If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the [EnableKey](~~35150~~) operation to enable the CMK.
      * In this example, the CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****` is disabled.
      *
      * @param request DisableKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DisableKeyResponse
     */
    public DisableKeyResponse disableKeyWithOptions(DisableKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableKeyResponse());
    }

    /**
      * If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the [EnableKey](~~35150~~) operation to enable the CMK.
      * In this example, the CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****` is disabled.
      *
      * @param request DisableKeyRequest
      * @return DisableKeyResponse
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableKeyWithOptions(request, runtime);
    }

    public EnableKeyResponse enableKeyWithOptions(EnableKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableKeyResponse());
    }

    public EnableKeyResponse enableKey(EnableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableKeyWithOptions(request, runtime);
    }

    /**
      * *   KMS uses the primary version of a specified CMK to encrypt data.
      * *   Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.
      * *   When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the [Decrypt](~~28950~~) operation to decrypt the data key.
      *
      * @param tmpReq EncryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EncryptResponse
     */
    public EncryptResponse encryptWithOptions(EncryptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EncryptShrinkRequest request = new EncryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plaintext)) {
            query.put("Plaintext", request.plaintext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Encrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncryptResponse());
    }

    /**
      * *   KMS uses the primary version of a specified CMK to encrypt data.
      * *   Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.
      * *   When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the [Decrypt](~~28950~~) operation to decrypt the data key.
      *
      * @param request EncryptRequest
      * @return EncryptResponse
     */
    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptWithOptions(request, runtime);
    }

    /**
      * You can call the [GenerateDataKeyWithoutPlaintext](~~134043~~) operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
      * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.
      *
      * @param tmpReq ExportDataKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ExportDataKeyResponse
     */
    public ExportDataKeyResponse exportDataKeyWithOptions(ExportDataKeyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportDataKeyShrinkRequest request = new ExportDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBlob)) {
            query.put("PublicKeyBlob", request.publicKeyBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingAlgorithm)) {
            query.put("WrappingAlgorithm", request.wrappingAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingKeySpec)) {
            query.put("WrappingKeySpec", request.wrappingKeySpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDataKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDataKeyResponse());
    }

    /**
      * You can call the [GenerateDataKeyWithoutPlaintext](~~134043~~) operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
      * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.
      *
      * @param request ExportDataKeyRequest
      * @return ExportDataKeyResponse
     */
    public ExportDataKeyResponse exportDataKey(ExportDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDataKeyWithOptions(request, runtime);
    }

    /**
      * We recommend that you perform the following steps to import your data key to a cryptographic module:
      * *   Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.
      * *   Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.
      * *   Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.
      * >  The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.
      *
      * @param tmpReq GenerateAndExportDataKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateAndExportDataKeyResponse
     */
    public GenerateAndExportDataKeyResponse generateAndExportDataKeyWithOptions(GenerateAndExportDataKeyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateAndExportDataKeyShrinkRequest request = new GenerateAndExportDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySpec)) {
            query.put("KeySpec", request.keySpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfBytes)) {
            query.put("NumberOfBytes", request.numberOfBytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBlob)) {
            query.put("PublicKeyBlob", request.publicKeyBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingAlgorithm)) {
            query.put("WrappingAlgorithm", request.wrappingAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingKeySpec)) {
            query.put("WrappingKeySpec", request.wrappingKeySpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAndExportDataKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAndExportDataKeyResponse());
    }

    /**
      * We recommend that you perform the following steps to import your data key to a cryptographic module:
      * *   Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.
      * *   Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.
      * *   Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.
      * >  The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.
      *
      * @param request GenerateAndExportDataKeyRequest
      * @return GenerateAndExportDataKeyResponse
     */
    public GenerateAndExportDataKeyResponse generateAndExportDataKey(GenerateAndExportDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAndExportDataKeyWithOptions(request, runtime);
    }

    /**
      * This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
      * We recommend that you locally encrypt data by performing the following steps:
      * 1\\. Call the GenerateDataKey operation.
      * 2\\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
      * 3\\. Store the encrypted data together with the ciphertext of the data key that you obtain.
      * We recommend that you locally decrypt data by performing the following steps:
      * *   Call the [Decrypt](~~28950~~) operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.
      * *   Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
      * In this example, a random data key is generated for the CMK whose ID is `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
      * @param tmpReq GenerateDataKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateDataKeyResponse
     */
    public GenerateDataKeyResponse generateDataKeyWithOptions(GenerateDataKeyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateDataKeyShrinkRequest request = new GenerateDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySpec)) {
            query.put("KeySpec", request.keySpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfBytes)) {
            query.put("NumberOfBytes", request.numberOfBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDataKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDataKeyResponse());
    }

    /**
      * This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
      * We recommend that you locally encrypt data by performing the following steps:
      * 1\\. Call the GenerateDataKey operation.
      * 2\\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
      * 3\\. Store the encrypted data together with the ciphertext of the data key that you obtain.
      * We recommend that you locally decrypt data by performing the following steps:
      * *   Call the [Decrypt](~~28950~~) operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.
      * *   Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
      * In this example, a random data key is generated for the CMK whose ID is `7906979c-8e06-46a2-be2d-68e3ccbc****`.
      *
      * @param request GenerateDataKeyRequest
      * @return GenerateDataKeyResponse
     */
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyWithOptions(request, runtime);
    }

    /**
      * This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the [GenerateDataKey](~~28948~~) operation. The only difference is that this operation does not return the plaintext of the data key.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.
      * > 
      * *   This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the [Decrypt](~~28950~~) operation to decrypt the ciphertext of the data key.
      * *   This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.
      *
      * @param tmpReq GenerateDataKeyWithoutPlaintextRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateDataKeyWithoutPlaintextResponse
     */
    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintextWithOptions(GenerateDataKeyWithoutPlaintextRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateDataKeyWithoutPlaintextShrinkRequest request = new GenerateDataKeyWithoutPlaintextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionContextShrink)) {
            query.put("EncryptionContext", request.encryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySpec)) {
            query.put("KeySpec", request.keySpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfBytes)) {
            query.put("NumberOfBytes", request.numberOfBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDataKeyWithoutPlaintext"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDataKeyWithoutPlaintextResponse());
    }

    /**
      * This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the [GenerateDataKey](~~28948~~) operation. The only difference is that this operation does not return the plaintext of the data key.
      * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.
      * > 
      * *   This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the [Decrypt](~~28950~~) operation to decrypt the ciphertext of the data key.
      * *   This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.
      *
      * @param request GenerateDataKeyWithoutPlaintextRequest
      * @return GenerateDataKeyWithoutPlaintextResponse
     */
    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyWithoutPlaintextWithOptions(request, runtime);
    }

    /**
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.
      *
      * @param request GetCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificateWithOptions(GetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificate"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateResponse());
    }

    /**
      * In this example, the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.
      *
      * @param request GetCertificateRequest
      * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateWithOptions(request, runtime);
    }

    /**
      * The returned parameters can be used to call the [ImportKeyMaterial](https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial) operation.
      * - You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.
      * - The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.
      * - The public key and token that are returned vary each time you call the GetParametersForImport operation.
      * - You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   
      * | Public key type | Encryption algorithm | Description |
      * | --------------- | -------------------- | ----------- |
      * | RSA_2048 | RSAES_PKCS1_V1_5 
      * RSAES_OAEP_SHA_1 
      * RSAES_OAEP_SHA_256 | CMKs of all regions and all protection levels are supported. 
      * Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1. |
      * | EC_SM2 | SM2PKE | CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see [Overview of Managed HSM](https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview). |
      * For more information, see [Import key material](https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material). This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is `1234abcd-12ab-34cd-56ef-12345678****`, the encryption algorithm is `RSAES_PKCS1_V1_5`, and the public key is of the `RSA_2048` type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.
      *
      * @param request GetParametersForImportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetParametersForImportResponse
     */
    public GetParametersForImportResponse getParametersForImportWithOptions(GetParametersForImportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingAlgorithm)) {
            query.put("WrappingAlgorithm", request.wrappingAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrappingKeySpec)) {
            query.put("WrappingKeySpec", request.wrappingKeySpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParametersForImport"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParametersForImportResponse());
    }

    /**
      * The returned parameters can be used to call the [ImportKeyMaterial](https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial) operation.
      * - You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.
      * - The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.
      * - The public key and token that are returned vary each time you call the GetParametersForImport operation.
      * - You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   
      * | Public key type | Encryption algorithm | Description |
      * | --------------- | -------------------- | ----------- |
      * | RSA_2048 | RSAES_PKCS1_V1_5 
      * RSAES_OAEP_SHA_1 
      * RSAES_OAEP_SHA_256 | CMKs of all regions and all protection levels are supported. 
      * Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1. |
      * | EC_SM2 | SM2PKE | CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see [Overview of Managed HSM](https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview). |
      * For more information, see [Import key material](https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material). This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is `1234abcd-12ab-34cd-56ef-12345678****`, the encryption algorithm is `RSAES_PKCS1_V1_5`, and the public key is of the `RSA_2048` type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.
      *
      * @param request GetParametersForImportRequest
      * @return GetParametersForImportResponse
     */
    public GetParametersForImportResponse getParametersForImport(GetParametersForImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParametersForImportWithOptions(request, runtime);
    }

    public GetPublicKeyResponse getPublicKeyWithOptions(GetPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersionId)) {
            query.put("KeyVersionId", request.keyVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublicKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublicKeyResponse());
    }

    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicKeyWithOptions(request, runtime);
    }

    public GetRandomPasswordResponse getRandomPasswordWithOptions(GetRandomPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeCharacters)) {
            query.put("ExcludeCharacters", request.excludeCharacters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeLowercase)) {
            query.put("ExcludeLowercase", request.excludeLowercase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeNumbers)) {
            query.put("ExcludeNumbers", request.excludeNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludePunctuation)) {
            query.put("ExcludePunctuation", request.excludePunctuation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeUppercase)) {
            query.put("ExcludeUppercase", request.excludeUppercase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordLength)) {
            query.put("PasswordLength", request.passwordLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireEachIncludedType)) {
            query.put("RequireEachIncludedType", request.requireEachIncludedType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRandomPassword"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRandomPasswordResponse());
    }

    public GetRandomPasswordResponse getRandomPassword(GetRandomPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRandomPasswordWithOptions(request, runtime);
    }

    /**
      * If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
      * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the `kms:Decrypt` permission on the CMK to call the GetSecretValue operation.
      * In this example, the value of the secret named `secret001` is obtained. The secret value is returned in the `SecretData` parameter. The secret value is `testdata1`.
      *
      * @param request GetSecretValueRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValueWithOptions(GetSecretValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchExtendedConfig)) {
            query.put("FetchExtendedConfig", request.fetchExtendedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStage)) {
            query.put("VersionStage", request.versionStage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretValue"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretValueResponse());
    }

    /**
      * If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
      * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the `kms:Decrypt` permission on the CMK to call the GetSecretValue operation.
      * In this example, the value of the secret named `secret001` is obtained. The secret value is returned in the `SecretData` parameter. The secret value is `testdata1`.
      *
      * @param request GetSecretValueRequest
      * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValue(GetSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretValueWithOptions(request, runtime);
    }

    /**
      * Call [CreateKey](~~28947~~) when creating a CMK, you can select its key material source as external.** Origin** set to** EXTERNAL**. This API is used to import the key material into the CMK.
      * *   To view the CMK **Origin**, see [DescribeKey](~~28952~~).
      * *   Before importing key material, you need to call the [GetParametersForImport](~~68621~~) obtain the parameters required to import the key material, including the public key and import token.
      * > 
      * *   The key type of the pair is** Aliyun_AES\\_256** the key material must be 256 bits. The key type must be** Aliyun_SM4** the CMK and key material must be 128 bits.
      * *   You can set the expiration time for the key material, or you can set it to never expire.
      * *   You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.
      * *   After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.
      * *   A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.
      *
      * @param request ImportKeyMaterialRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ImportKeyMaterialResponse
     */
    public ImportKeyMaterialResponse importKeyMaterialWithOptions(ImportKeyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptedKeyMaterial)) {
            query.put("EncryptedKeyMaterial", request.encryptedKeyMaterial);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importToken)) {
            query.put("ImportToken", request.importToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyMaterialExpireUnix)) {
            query.put("KeyMaterialExpireUnix", request.keyMaterialExpireUnix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyMaterial"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyMaterialResponse());
    }

    /**
      * Call [CreateKey](~~28947~~) when creating a CMK, you can select its key material source as external.** Origin** set to** EXTERNAL**. This API is used to import the key material into the CMK.
      * *   To view the CMK **Origin**, see [DescribeKey](~~28952~~).
      * *   Before importing key material, you need to call the [GetParametersForImport](~~68621~~) obtain the parameters required to import the key material, including the public key and import token.
      * > 
      * *   The key type of the pair is** Aliyun_AES\\_256** the key material must be 256 bits. The key type must be** Aliyun_SM4** the CMK and key material must be 128 bits.
      * *   You can set the expiration time for the key material, or you can set it to never expire.
      * *   You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.
      * *   After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.
      * *   A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.
      *
      * @param request ImportKeyMaterialRequest
      * @return ImportKeyMaterialResponse
     */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyMaterialWithOptions(request, runtime);
    }

    public ListAliasesResponse listAliasesWithOptions(ListAliasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliases"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliasesResponse());
    }

    public ListAliasesResponse listAliases(ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesWithOptions(request, runtime);
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyIdWithOptions(ListAliasesByKeyIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliasesByKeyId"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliasesByKeyIdResponse());
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyId(ListAliasesByKeyIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesByKeyIdWithOptions(request, runtime);
    }

    public ListKeyVersionsResponse listKeyVersionsWithOptions(ListKeyVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKeyVersions"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKeyVersionsResponse());
    }

    public ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeyVersionsWithOptions(request, runtime);
    }

    public ListKeysResponse listKeysWithOptions(ListKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKeys"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKeysResponse());
    }

    public ListKeysResponse listKeys(ListKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeysWithOptions(request, runtime);
    }

    /**
      * Request format: KeyId="string"
      *
      * @param request ListResourceTagsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTagsWithOptions(ListResourceTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTags"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTagsResponse());
    }

    /**
      * Request format: KeyId="string"
      *
      * @param request ListResourceTagsRequest
      * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTagsWithOptions(request, runtime);
    }

    /**
      * The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.
      *
      * @param request ListSecretVersionIdsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSecretVersionIdsResponse
     */
    public ListSecretVersionIdsResponse listSecretVersionIdsWithOptions(ListSecretVersionIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeDeprecated)) {
            query.put("IncludeDeprecated", request.includeDeprecated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecretVersionIds"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretVersionIdsResponse());
    }

    /**
      * The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.
      *
      * @param request ListSecretVersionIdsRequest
      * @return ListSecretVersionIdsResponse
     */
    public ListSecretVersionIdsResponse listSecretVersionIds(ListSecretVersionIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretVersionIdsWithOptions(request, runtime);
    }

    /**
      * This operation returns the metadata information about the secrets and does not return encrypted secret values.
      * In this example, the secrets created by the current account in the current region are returned. The `PageNumber` parameter is set to `1`, and the `PageSize` parameter is set to `2`, which indicates that two secrets are to be returned on Page 1.
      *
      * @param request ListSecretsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecretsWithOptions(ListSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchTags)) {
            query.put("FetchTags", request.fetchTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecrets"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretsResponse());
    }

    /**
      * This operation returns the metadata information about the secrets and does not return encrypted secret values.
      * In this example, the secrets created by the current account in the current region are returned. The `PageNumber` parameter is set to `1`, and the `PageSize` parameter is set to `2`, which indicates that two secrets are to be returned on Page 1.
      *
      * @param request ListSecretsRequest
      * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretsWithOptions(request, runtime);
    }

    /**
      * When you call this operation, note that:
      * - KMS is a paid service. For more information about the billing method, see [Billing description](https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing).
      * - An Alibaba Cloud account can activate KMS only once.
      * - Make sure that your Alibaba Cloud account has passed real-name authentication.
      *
      * @param request OpenKmsServiceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return OpenKmsServiceResponse
     */
    public OpenKmsServiceResponse openKmsServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenKmsService"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenKmsServiceResponse());
    }

    /**
      * When you call this operation, note that:
      * - KMS is a paid service. For more information about the billing method, see [Billing description](https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing).
      * - An Alibaba Cloud account can activate KMS only once.
      * - Make sure that your Alibaba Cloud account has passed real-name authentication.
      *
      * @return OpenKmsServiceResponse
     */
    public OpenKmsServiceResponse openKmsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openKmsServiceWithOptions(runtime);
    }

    /**
      * This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
      * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
      * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:
      * *   If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.
      * *   If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.
      * *   If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
      * Limits: This operation is available only for standard secrets.
      * In this example, the secret value of a new version is stored into the `secret001` secret. The `VersionId` parameter is set to `00000000000000000000000000000000203` as the new version, and the `SecretData` parameter is set to `importantdata`.
      *
      * @param request PutSecretValueRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutSecretValueResponse
     */
    public PutSecretValueResponse putSecretValueWithOptions(PutSecretValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretData)) {
            query.put("SecretData", request.secretData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretDataType)) {
            query.put("SecretDataType", request.secretDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStages)) {
            query.put("VersionStages", request.versionStages);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutSecretValue"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutSecretValueResponse());
    }

    /**
      * This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
      * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
      * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:
      * *   If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.
      * *   If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.
      * *   If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
      * Limits: This operation is available only for standard secrets.
      * In this example, the secret value of a new version is stored into the `secret001` secret. The `VersionId` parameter is set to `00000000000000000000000000000000203` as the new version, and the `SecretData` parameter is set to `importantdata`.
      *
      * @param request PutSecretValueRequest
      * @return PutSecretValueResponse
     */
    public PutSecretValueResponse putSecretValue(PutSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putSecretValueWithOptions(request, runtime);
    }

    /**
      * You can call this operation in the following scenarios:
      * *   After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see [Configure automatic key rotation](~~134270~~).
      * *   The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.
      * *   You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
      * To use the ReEncrypt operation, you must have two permissions:
      * *   kms:ReEncryptFrom on the source CMK
      * *   kms:ReEncryptTo on the destination CMK
      * *   For simplicity, you can specify kms:ReEncrypt\\* to allow both of the preceding permissions.
      *
      * @param tmpReq ReEncryptRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReEncryptResponse
     */
    public ReEncryptResponse reEncryptWithOptions(ReEncryptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReEncryptShrinkRequest request = new ReEncryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationEncryptionContext)) {
            request.destinationEncryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationEncryptionContext, "DestinationEncryptionContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceEncryptionContext)) {
            request.sourceEncryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceEncryptionContext, "SourceEncryptionContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphertextBlob)) {
            query.put("CiphertextBlob", request.ciphertextBlob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEncryptionContextShrink)) {
            query.put("DestinationEncryptionContext", request.destinationEncryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationKeyId)) {
            query.put("DestinationKeyId", request.destinationKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEncryptionAlgorithm)) {
            query.put("SourceEncryptionAlgorithm", request.sourceEncryptionAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEncryptionContextShrink)) {
            query.put("SourceEncryptionContext", request.sourceEncryptionContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKeyId)) {
            query.put("SourceKeyId", request.sourceKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceKeyVersionId)) {
            query.put("SourceKeyVersionId", request.sourceKeyVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReEncrypt"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReEncryptResponse());
    }

    /**
      * You can call this operation in the following scenarios:
      * *   After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see [Configure automatic key rotation](~~134270~~).
      * *   The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.
      * *   You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
      * To use the ReEncrypt operation, you must have two permissions:
      * *   kms:ReEncryptFrom on the source CMK
      * *   kms:ReEncryptTo on the destination CMK
      * *   For simplicity, you can specify kms:ReEncrypt\\* to allow both of the preceding permissions.
      *
      * @param request ReEncryptRequest
      * @return ReEncryptResponse
     */
    public ReEncryptResponse reEncrypt(ReEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reEncryptWithOptions(request, runtime);
    }

    /**
      * You can only use this operation to restore a deleted secret that is within its recovery period. If you set **ForceDeleteWithoutRecovery** to **true** when you delete the secret, you cannot restore it.
      *
      * @param request RestoreSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RestoreSecretResponse
     */
    public RestoreSecretResponse restoreSecretWithOptions(RestoreSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreSecretResponse());
    }

    /**
      * You can only use this operation to restore a deleted secret that is within its recovery period. If you set **ForceDeleteWithoutRecovery** to **true** when you delete the secret, you cannot restore it.
      *
      * @param request RestoreSecretRequest
      * @return RestoreSecretResponse
     */
    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreSecretWithOptions(request, runtime);
    }

    /**
      * Limits:
      * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
      * • The RotateSecret operation is unavailable for standard secrets.
      * In this example, the `RdsSecret/Mysql5.4/MyCred` secret is manually rotated, and the version number of the secret is set to `000000123` after the secret is rotated.
      *
      * @param request RotateSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RotateSecretResponse
     */
    public RotateSecretResponse rotateSecretWithOptions(RotateSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RotateSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RotateSecretResponse());
    }

    /**
      * Limits:
      * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
      * • The RotateSecret operation is unavailable for standard secrets.
      * In this example, the `RdsSecret/Mysql5.4/MyCred` secret is manually rotated, and the version number of the secret is set to `000000123` after the secret is rotated.
      *
      * @param request RotateSecretRequest
      * @return RotateSecretResponse
     */
    public RotateSecretResponse rotateSecret(RotateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rotateSecretWithOptions(request, runtime);
    }

    /**
      * During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
      * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the [DisableKey](~~35151~~) operation to disable the CMK.
      * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the [CancelKeyDeletion](~~44197~~) operation to cancel the key deletion task before the scheduled period ends.
      *
      * @param request ScheduleKeyDeletionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ScheduleKeyDeletionResponse
     */
    public ScheduleKeyDeletionResponse scheduleKeyDeletionWithOptions(ScheduleKeyDeletionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pendingWindowInDays)) {
            query.put("PendingWindowInDays", request.pendingWindowInDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScheduleKeyDeletion"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScheduleKeyDeletionResponse());
    }

    /**
      * During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
      * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the [DisableKey](~~35151~~) operation to disable the CMK.
      * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the [CancelKeyDeletion](~~44197~~) operation to cancel the key deletion task before the scheduled period ends.
      *
      * @param request ScheduleKeyDeletionRequest
      * @return ScheduleKeyDeletionResponse
     */
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scheduleKeyDeletionWithOptions(request, runtime);
    }

    /**
      * *   After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.
      * *   Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the [DescribeKey](~~28952~~) operation to query the CMK status, which is specified by the KeyState parameter.
      * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is `acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****` by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.
      *
      * @param request SetDeletionProtectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetDeletionProtectionResponse
     */
    public SetDeletionProtectionResponse setDeletionProtectionWithOptions(SetDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtectionDescription)) {
            query.put("DeletionProtectionDescription", request.deletionProtectionDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDeletionProtection)) {
            query.put("EnableDeletionProtection", request.enableDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectedResourceArn)) {
            query.put("ProtectedResourceArn", request.protectedResourceArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeletionProtection"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeletionProtectionResponse());
    }

    /**
      * *   After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.
      * *   Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the [DescribeKey](~~28952~~) operation to query the CMK status, which is specified by the KeyState parameter.
      * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is `acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****` by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.
      *
      * @param request SetDeletionProtectionRequest
      * @return SetDeletionProtectionResponse
     */
    public SetDeletionProtectionResponse setDeletionProtection(SetDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    /**
      * You can add up to 10 tags to a CMK, secret, or certificate.
      * In this example, the tags `[{"TagKey":"S1key1","TagValue":"S1val1"},{"TagKey":"S1key2","TagValue":"S2val2"}]` are added to the CMK whose ID is `08c33a6f-4e0a-4a1b-a3fa-7ddf****`.
      *
      * @param request TagResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TagResourceResponse
     */
    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResource"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourceResponse());
    }

    /**
      * You can add up to 10 tags to a CMK, secret, or certificate.
      * In this example, the tags `[{"TagKey":"S1key1","TagValue":"S1val1"},{"TagKey":"S1key2","TagValue":"S2val2"}]` are added to the CMK whose ID is `08c33a6f-4e0a-4a1b-a3fa-7ddf****`.
      *
      * @param request TagResourceRequest
      * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourceWithOptions(request, runtime);
    }

    /**
      * In this example, the tags whose tag keys are tagkey1 and tagkey2 are removed from the CMK whose ID is `08c33a6f-4e0a-4a1b-a3fa-7ddf****`.
      *
      * @param request UntagResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResource"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourceResponse());
    }

    /**
      * In this example, the tags whose tag keys are tagkey1 and tagkey2 are removed from the CMK whose ID is `08c33a6f-4e0a-4a1b-a3fa-7ddf****`.
      *
      * @param request UntagResourceRequest
      * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourceWithOptions(request, runtime);
    }

    public UpdateAliasResponse updateAliasWithOptions(UpdateAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlias"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliasResponse());
    }

    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAliasWithOptions(request, runtime);
    }

    /**
      * In this example, the status of the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is updated to INACTIVE.
      *
      * @param request UpdateCertificateStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCertificateStatusResponse
     */
    public UpdateCertificateStatusResponse updateCertificateStatusWithOptions(UpdateCertificateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCertificateStatus"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCertificateStatusResponse());
    }

    /**
      * In this example, the status of the certificate whose ID is `9a28de48-8d8b-484d-a766-dec4****` is updated to INACTIVE.
      *
      * @param request UpdateCertificateStatusRequest
      * @return UpdateCertificateStatusResponse
     */
    public UpdateCertificateStatusResponse updateCertificateStatus(UpdateCertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCertificateStatusWithOptions(request, runtime);
    }

    /**
      * This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the [DescribeKey](~~28952~~) operation. You can call this operation to add, modify, or delete the description of a CMK.
      *
      * @param request UpdateKeyDescriptionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateKeyDescriptionResponse
     */
    public UpdateKeyDescriptionResponse updateKeyDescriptionWithOptions(UpdateKeyDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKeyDescription"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKeyDescriptionResponse());
    }

    /**
      * This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the [DescribeKey](~~28952~~) operation. You can call this operation to add, modify, or delete the description of a CMK.
      *
      * @param request UpdateKeyDescriptionRequest
      * @return UpdateKeyDescriptionResponse
     */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKeyDescriptionWithOptions(request, runtime);
    }

    /**
      * When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
      * An automatic key rotation policy cannot be configured for the following keys:
      * *   Asymmetric key
      * *   Service-managed key
      * *   Bring your own key (BYOK) that is imported into KMS
      * *   Key that is not in the **Enabled** state
      * In this example, automatic key rotation is enabled for a CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****`. The automatic rotation period is 30 days.
      *
      * @param request UpdateRotationPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateRotationPolicyResponse
     */
    public UpdateRotationPolicyResponse updateRotationPolicyWithOptions(UpdateRotationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomaticRotation)) {
            query.put("EnableAutomaticRotation", request.enableAutomaticRotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationInterval)) {
            query.put("RotationInterval", request.rotationInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRotationPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRotationPolicyResponse());
    }

    /**
      * When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
      * An automatic key rotation policy cannot be configured for the following keys:
      * *   Asymmetric key
      * *   Service-managed key
      * *   Bring your own key (BYOK) that is imported into KMS
      * *   Key that is not in the **Enabled** state
      * In this example, automatic key rotation is enabled for a CMK whose ID is `1234abcd-12ab-34cd-56ef-12345678****`. The automatic rotation period is 30 days.
      *
      * @param request UpdateRotationPolicyRequest
      * @return UpdateRotationPolicyResponse
     */
    public UpdateRotationPolicyResponse updateRotationPolicy(UpdateRotationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRotationPolicyWithOptions(request, runtime);
    }

    /**
      * In this example, the metadata of the `secret001` secret is updated. The `Description` parameter is set to `datainfo`.
      *
      * @param request UpdateSecretRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecretWithOptions(UpdateSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedConfig)) {
            query.put("ExtendedConfig", request.extendedConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecret"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretResponse());
    }

    /**
      * In this example, the metadata of the `secret001` secret is updated. The `Description` parameter is set to `datainfo`.
      *
      * @param request UpdateSecretRequest
      * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretWithOptions(request, runtime);
    }

    /**
      * After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
      * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
      * In this example, the rotation policy of the `RdsSecret/Mysql5.4/MyCred` secret is updated. The following settings are modified:
      * *   The `EnableAutomaticRotation` parameter is set to `true`, which indicates that automatic rotation is enabled.
      * *   The `RotationInterval` parameter is set to `30d`, which indicates that the interval for automatic rotation is 30 days.
      *
      * @param request UpdateSecretRotationPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateSecretRotationPolicyResponse
     */
    public UpdateSecretRotationPolicyResponse updateSecretRotationPolicyWithOptions(UpdateSecretRotationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomaticRotation)) {
            query.put("EnableAutomaticRotation", request.enableAutomaticRotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationInterval)) {
            query.put("RotationInterval", request.rotationInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecretRotationPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretRotationPolicyResponse());
    }

    /**
      * After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
      * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
      * In this example, the rotation policy of the `RdsSecret/Mysql5.4/MyCred` secret is updated. The following settings are modified:
      * *   The `EnableAutomaticRotation` parameter is set to `true`, which indicates that automatic rotation is enabled.
      * *   The `RotationInterval` parameter is set to `30d`, which indicates that the interval for automatic rotation is 30 days.
      *
      * @param request UpdateSecretRotationPolicyRequest
      * @return UpdateSecretRotationPolicyResponse
     */
    public UpdateSecretRotationPolicyResponse updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretRotationPolicyWithOptions(request, runtime);
    }

    /**
      * You can use this operation to achieve the following purposes:
      * *   Use a specified stage label to mark a new secret version.
      * *   Remove a specific stage label from an existing secret version.
      * Limits: This operation is available only for generic secrets.
      * In this example, the stage label that marks the version of the `secret001` secret is updated. The stage label `ACSCurrent` is used to mark the `002` version.
      *
      * @param request UpdateSecretVersionStageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateSecretVersionStageResponse
     */
    public UpdateSecretVersionStageResponse updateSecretVersionStageWithOptions(UpdateSecretVersionStageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.moveToVersion)) {
            query.put("MoveToVersion", request.moveToVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeFromVersion)) {
            query.put("RemoveFromVersion", request.removeFromVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionStage)) {
            query.put("VersionStage", request.versionStage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecretVersionStage"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretVersionStageResponse());
    }

    /**
      * You can use this operation to achieve the following purposes:
      * *   Use a specified stage label to mark a new secret version.
      * *   Remove a specific stage label from an existing secret version.
      * Limits: This operation is available only for generic secrets.
      * In this example, the stage label that marks the version of the `secret001` secret is updated. The stage label `ACSCurrent` is used to mark the `002` version.
      *
      * @param request UpdateSecretVersionStageRequest
      * @return UpdateSecretVersionStageResponse
     */
    public UpdateSecretVersionStageResponse updateSecretVersionStage(UpdateSecretVersionStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretVersionStageWithOptions(request, runtime);
    }

    /**
      * In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is `12345678-1234-1234-1234-12345678****`.
      *
      * @param request UploadCertificateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UploadCertificateResponse
     */
    public UploadCertificateResponse uploadCertificateWithOptions(UploadCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            query.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateChain)) {
            query.put("CertificateChain", request.certificateChain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadCertificate"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCertificateResponse());
    }

    /**
      * In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is `12345678-1234-1234-1234-12345678****`.
      *
      * @param request UploadCertificateRequest
      * @return UploadCertificateResponse
     */
    public UploadCertificateResponse uploadCertificate(UploadCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCertificateWithOptions(request, runtime);
    }
}
