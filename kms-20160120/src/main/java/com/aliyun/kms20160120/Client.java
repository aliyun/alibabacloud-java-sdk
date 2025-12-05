// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120;

import com.aliyun.tea.*;
import com.aliyun.kms20160120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Kms";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists supported encryption algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum length in bytes</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6144</td>
     * </tr>
     * <tr>
     * <td>In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the decryption algorithm <code>RSAES_OAEP_SHA_1</code> are used to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using an asymmetric key.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists supported encryption algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum length in bytes</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6144</td>
     * </tr>
     * <tr>
     * <td>In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the decryption algorithm <code>RSAES_OAEP_SHA_1</code> are used to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using an asymmetric key.</p>
     * 
     * @param request AsymmetricDecryptRequest
     * @return AsymmetricDecryptResponse
     */
    public AsymmetricDecryptResponse asymmetricDecrypt(AsymmetricDecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricDecryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists the supported encryption algorithms: </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum number of bytes that can be encrypted</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>190</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>214</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>318</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>342</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>You can use the asymmetric CMK whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the algorithm <code>RSAES_OAEP_SHA_1</code> to encrypt the plaintext <code>SGVsbG8gd29ybGQ=</code> based on the parameter settings provided in this topic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using an asymmetric customer master key (CMK).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>This operation is supported only for asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists the supported encryption algorithms: </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum number of bytes that can be encrypted</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>190</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>214</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>318</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>342</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>You can use the asymmetric CMK whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the algorithm <code>RSAES_OAEP_SHA_1</code> to encrypt the plaintext <code>SGVsbG8gd29ybGQ=</code> based on the parameter settings provided in this topic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using an asymmetric customer master key (CMK).</p>
     * 
     * @param request AsymmetricEncryptRequest
     * @return AsymmetricEncryptResponse
     */
    public AsymmetricEncryptResponse asymmetricEncrypt(AsymmetricEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricEncryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Generates a signature by using an asymmetric key.</p>
     * 
     * <b>summary</b> : 
     * <p>AsymmetricSign</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>Generates a signature by using an asymmetric key.</p>
     * 
     * <b>summary</b> : 
     * <p>AsymmetricSign</p>
     * 
     * @param request AsymmetricSignRequest
     * @return AsymmetricSignResponse
     */
    public AsymmetricSignResponse asymmetricSign(AsymmetricSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>EC_P256</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_P256K</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2DSA</td>
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p> When you calculate the SM2 signature based on GB/T 32918, the <strong>Digest</strong> parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature <code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</code> of the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies a signature by using an asymmetric key.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>EC_P256</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_P256K</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2DSA</td>
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p> When you calculate the SM2 signature based on GB/T 32918, the <strong>Digest</strong> parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature <code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</code> of the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies a signature by using an asymmetric key.</p>
     * 
     * @param request AsymmetricVerifyRequest
     * @return AsymmetricVerifyResponse
     */
    public AsymmetricVerifyResponse asymmetricVerify(AsymmetricVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.</p>
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
     * <b>description</b> :
     * <p>If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.</p>
     * 
     * @param request CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelKeyDeletionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to decrypt the data <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using a specific certificate.</p>
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
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to decrypt the data <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using a specific certificate.</p>
     * 
     * @param request CertificatePrivateKeyDecryptRequest
     * @return CertificatePrivateKeyDecryptResponse
     */
    public CertificatePrivateKeyDecryptResponse certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePrivateKeyDecryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to generate a signature for the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates a signature by using a specified certificate.</p>
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
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to generate a signature for the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Generates a signature by using a specified certificate.</p>
     * 
     * @param request CertificatePrivateKeySignRequest
     * @return CertificatePrivateKeySignResponse
     */
    public CertificatePrivateKeySignResponse certificatePrivateKeySign(CertificatePrivateKeySignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePrivateKeySignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to encrypt the data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using a specific certificate.</p>
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
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to encrypt the data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using a specific certificate.</p>
     * 
     * @param request CertificatePublicKeyEncryptRequest
     * @return CertificatePublicKeyEncryptResponse
     */
    public CertificatePublicKeyEncryptResponse certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePublicKeyEncryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to verify the digital signature <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code> of the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Verifies a digital signature by using a specified certificate.</p>
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
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to verify the digital signature <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code> of the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Verifies a digital signature by using a specified certificate.</p>
     * 
     * @param request CertificatePublicKeyVerifyRequest
     * @return CertificatePublicKeyVerifyResponse
     */
    public CertificatePublicKeyVerifyResponse certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.certificatePublicKeyVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can enable only instances of the software key management type. You cannot enable instances of the hardware key management type.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a Key Management Service (KMS) instance.</p>
     * 
     * @param request ConnectKmsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConnectKmsInstanceResponse
     */
    public ConnectKmsInstanceResponse connectKmsInstanceWithOptions(ConnectKmsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.KMProvider)) {
            query.put("KMProvider", request.KMProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIds)) {
            query.put("ZoneIds", request.zoneIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConnectKmsInstance"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConnectKmsInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can enable only instances of the software key management type. You cannot enable instances of the hardware key management type.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a Key Management Service (KMS) instance.</p>
     * 
     * @param request ConnectKmsInstanceRequest
     * @return ConnectKmsInstanceResponse
     */
    public ConnectKmsInstanceResponse connectKmsInstance(ConnectKmsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.connectKmsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each alias can be bound to only one CMK at a time.</p>
     * <ul>
     * <li>The aliases of CMKs in the same region must be unique.
     * In this topic, an alias named <code>alias/example</code> is created for a CMK named <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>  Each alias can be bound to only one CMK at a time.</p>
     * <ul>
     * <li>The aliases of CMKs in the same region must be unique.
     * In this topic, an alias named <code>alias/example</code> is created for a CMK named <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * @param request CreateAliasRequest
     * @return CreateAliasResponse
     */
    public CreateAliasResponse createAlias(CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAliasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based AAP:
     * 1.Create a network access rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access KMS. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind network access rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. This topic describes how to create an AAP.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application access point (AAP)</p>
     * 
     * @param request CreateApplicationAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationAccessPointResponse
     */
    public CreateApplicationAccessPointResponse createApplicationAccessPointWithOptions(CreateApplicationAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationMethod)) {
            query.put("AuthenticationMethod", request.authenticationMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policies)) {
            query.put("Policies", request.policies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationAccessPoint"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based AAP:
     * 1.Create a network access rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access KMS. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind network access rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. This topic describes how to create an AAP.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application access point (AAP)</p>
     * 
     * @param request CreateApplicationAccessPointRequest
     * @return CreateApplicationAccessPointResponse
     */
    public CreateApplicationAccessPointResponse createApplicationAccessPoint(CreateApplicationAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP.</p>
     * <h3>Precautions</h3>
     * <p>A client key has a validity period. After a client key expires, applications into which the client key is integrated cannot access the required KMS instance. You must replace the client key before the client key expires. We recommend that you delete the expired client key in KMS after the new client key is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a client key.</p>
     * 
     * @param request CreateClientKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientKeyResponse
     */
    public CreateClientKeyResponse createClientKeyWithOptions(CreateClientKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aapName)) {
            query.put("AapName", request.aapName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notAfter)) {
            query.put("NotAfter", request.notAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notBefore)) {
            query.put("NotBefore", request.notBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP.</p>
     * <h3>Precautions</h3>
     * <p>A client key has a validity period. After a client key expires, applications into which the client key is integrated cannot access the required KMS instance. You must replace the client key before the client key expires. We recommend that you delete the expired client key in KMS after the new client key is used.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a client key.</p>
     * 
     * @param request CreateClientKeyRequest
     * @return CreateClientKeyResponse
     */
    public CreateClientKeyResponse createClientKey(CreateClientKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>KMS supports common symmetric keys and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key types and specifications</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a customer master key (CMK).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.keyStorageMechanism)) {
            query.put("KeyStorageMechanism", request.keyStorageMechanism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyUsage)) {
            query.put("KeyUsage", request.keyUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionLevel)) {
            query.put("ProtectionLevel", request.protectionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rotationInterval)) {
            query.put("RotationInterval", request.rotationInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
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
     * <b>description</b> :
     * <p>KMS supports common symmetric keys and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key types and specifications</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a customer master key (CMK).</p>
     * 
     * @param request CreateKeyRequest
     * @return CreateKeyResponse
     */
    public CreateKeyResponse createKey(CreateKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</p>
     * <ul>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>为密钥创建新的密钥版本。</p>
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
     * <b>description</b> :
     * <p>  You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</p>
     * <ul>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>为密钥创建新的密钥版本。</p>
     * 
     * @param request CreateKeyVersionRequest
     * @return CreateKeyVersionResponse
     */
    public CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a KMS instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control rule to configure the private IP addresses or CIDR blocks that are allowed to access a Key Management Service (KMS) instance.</p>
     * 
     * @param request CreateNetworkRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkRuleResponse
     */
    public CreateNetworkRuleResponse createNetworkRuleWithOptions(CreateNetworkRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePrivateIp)) {
            query.put("SourcePrivateIp", request.sourcePrivateIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkRule"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a KMS instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control rule to configure the private IP addresses or CIDR blocks that are allowed to access a Key Management Service (KMS) instance.</p>
     * 
     * @param request CreateNetworkRuleRequest
     * @return CreateNetworkRuleResponse
     */
    public CreateNetworkRuleResponse createNetworkRule(CreateNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission policy to configure the keys and secrets that are allowed to access.</p>
     * 
     * @param request CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlRules)) {
            query.put("AccessControlRules", request.accessControlRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstance)) {
            query.put("KmsInstance", request.kmsInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            query.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission policy to configure the keys and secrets that are allowed to access.</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The name of the secret.
     * The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following list describes the name requirements for different types of secrets:</p>
     * <ul>
     * <li>If the SecretType parameter is set to Generic or Rds, the name cannot start with <code>acs/</code>.</li>
     * <li>If the SecretType parameter is set to RAMCredentials, set the SecretName parameter to <code>$Auto</code>. In this case, KMS automatically generates a secret name that starts with <code>acs/ram/user/</code>. The name includes the display name of RAM user.</li>
     * <li>If the SecretType parameter is set to ECS, the name must start with <code>acs/ecs/</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建凭据并存入凭据的初始版本。</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
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
     * <b>description</b> :
     * <p>The name of the secret.
     * The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following list describes the name requirements for different types of secrets:</p>
     * <ul>
     * <li>If the SecretType parameter is set to Generic or Rds, the name cannot start with <code>acs/</code>.</li>
     * <li>If the SecretType parameter is set to RAMCredentials, set the SecretName parameter to <code>$Auto</code>. In this case, KMS automatically generates a secret name that starts with <code>acs/ram/user/</code>. The name includes the display name of RAM user.</li>
     * <li>If the SecretType parameter is set to ECS, the name must start with <code>acs/ecs/</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建凭据并存入凭据的初始版本。</p>
     * 
     * @param request CreateSecretRequest
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用Decrypt接口解密CiphertextBlob中的密文。</p>
     * 
     * @param tmpReq DecryptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecryptResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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

    /**
     * <b>summary</b> : 
     * <p>调用Decrypt接口解密CiphertextBlob中的密文。</p>
     * 
     * @param request DecryptRequest
     * @return DecryptResponse
     */
    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAliasResponse
     */
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

    /**
     * @param request DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAliasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an AAP, make sure that the AAP is no longer in use. If you delete an AAP that is in use, applications that use the AAP cannot access Key Management Service (KMS). Exercise caution when you delete an AAP.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application access point (AAP).</p>
     * 
     * @param request DeleteApplicationAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationAccessPointResponse
     */
    public DeleteApplicationAccessPointResponse deleteApplicationAccessPointWithOptions(DeleteApplicationAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationAccessPoint"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an AAP, make sure that the AAP is no longer in use. If you delete an AAP that is in use, applications that use the AAP cannot access Key Management Service (KMS). Exercise caution when you delete an AAP.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application access point (AAP).</p>
     * 
     * @param request DeleteApplicationAccessPointRequest
     * @return DeleteApplicationAccessPointResponse
     */
    public DeleteApplicationAccessPointResponse deleteApplicationAccessPoint(DeleteApplicationAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
     * In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> and its private key and certificate chain are deleted.</p>
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
     * <b>description</b> :
     * <p>After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
     * In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> and its private key and certificate chain are deleted.</p>
     * 
     * @param request DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a client key, make sure that the client key is no longer in use. If you delete a client key that is in use, applications that use the client key cannot access Key Management Service (KMS). Exercise caution when you delete a client key.</p>
     * 
     * @param request DeleteClientKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientKeyResponse
     */
    public DeleteClientKeyResponse deleteClientKeyWithOptions(DeleteClientKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientKeyId)) {
            query.put("ClientKeyId", request.clientKeyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a client key, make sure that the client key is no longer in use. If you delete a client key that is in use, applications that use the client key cannot access Key Management Service (KMS). Exercise caution when you delete a client key.</p>
     * 
     * @param request DeleteClientKeyRequest
     * @return DeleteClientKeyResponse
     */
    public DeleteClientKeyResponse deleteClientKey(DeleteClientKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation does not delete the CMK that is created by using the key material.
     * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
     * After you delete the key material, you can upload only the same key material into the CMK.</p>
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
     * <b>description</b> :
     * <p>This operation does not delete the CMK that is created by using the key material.
     * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
     * After you delete the key material, you can upload only the same key material into the CMK.</p>
     * 
     * @param request DeleteKeyMaterialRequest
     * @return DeleteKeyMaterialResponse
     */
    public DeleteKeyMaterialResponse deleteKeyMaterial(DeleteKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyMaterialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a network access rule, make sure that the network access rule is not bound to permission policies. Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a network access rule.</p>
     * 
     * @param request DeleteNetworkRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkRuleResponse
     */
    public DeleteNetworkRuleResponse deleteNetworkRuleWithOptions(DeleteNetworkRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkRule"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a network access rule, make sure that the network access rule is not bound to permission policies. Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a network access rule.</p>
     * 
     * @param request DeleteNetworkRuleRequest
     * @return DeleteNetworkRuleResponse
     */
    public DeleteNetworkRuleResponse deleteNetworkRule(DeleteNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a permission policy, make sure that the permission policy is not associated with application access points (AAPs). Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a permission policy, make sure that the permission policy is not associated with application access points (AAPs). Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
     * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.</p>
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
     * <b>description</b> :
     * <p>If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
     * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.</p>
     * 
     * @param request DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAccountKmsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountKmsStatusResponse
     */
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

    /**
     * @return DescribeAccountKmsStatusResponse
     */
    public DescribeAccountKmsStatusResponse describeAccountKmsStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountKmsStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application access point (AAP).</p>
     * 
     * @param request DescribeApplicationAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationAccessPointResponse
     */
    public DescribeApplicationAccessPointResponse describeApplicationAccessPointWithOptions(DescribeApplicationAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationAccessPoint"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationAccessPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application access point (AAP).</p>
     * 
     * @param request DescribeApplicationAccessPointRequest
     * @return DescribeApplicationAccessPointResponse
     */
    public DescribeApplicationAccessPointResponse describeApplicationAccessPoint(DescribeApplicationAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.</p>
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
     * <b>description</b> :
     * <p>In this example, the information about the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.</p>
     * 
     * @param request DescribeCertificateRequest
     * @return DescribeCertificateResponse
     */
    public DescribeCertificateResponse describeCertificate(DescribeCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a customer master key (CMK).</p>
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
     * <b>description</b> :
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a customer master key (CMK).</p>
     * 
     * @param request DescribeKeyRequest
     * @return DescribeKeyResponse
     */
    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.</p>
     * 
     * @param request DescribeKeyVersionRequest
     * @return DescribeKeyVersionResponse
     */
    public DescribeKeyVersionResponse describeKeyVersion(DescribeKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access control rule.</p>
     * 
     * @param request DescribeNetworkRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkRuleResponse
     */
    public DescribeNetworkRuleResponse describeNetworkRuleWithOptions(DescribeNetworkRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkRule"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access control rule.</p>
     * 
     * @param request DescribeNetworkRuleRequest
     * @return DescribeNetworkRuleResponse
     */
    public DescribeNetworkRuleResponse describeNetworkRule(DescribeNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a permission policy.</p>
     * 
     * @param request DescribePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyResponse
     */
    public DescribePolicyResponse describePolicyWithOptions(DescribePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a permission policy.</p>
     * 
     * @param request DescribePolicyRequest
     * @return DescribePolicyResponse
     */
    public DescribePolicyResponse describePolicy(DescribePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Kms%5C&api=DescribeRegions%5C&type=RPC%5C&version=2016-01-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Kms%5C&api=DescribeRegions%5C&type=RPC%5C&version=2016-01-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns the metadata of a secret. This operation does not return the secret value.
     * In this example, the metadata of the secret named <code>secret001</code> is queried.</p>
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
     * <b>description</b> :
     * <p>This operation returns the metadata of a secret. This operation does not return the secret value.
     * In this example, the metadata of the secret named <code>secret001</code> is queried.</p>
     * 
     * @param request DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the <a href="https://help.aliyun.com/document_detail/35150.html">EnableKey</a> operation to enable the CMK.
     * In this example, the CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code> is disabled.</p>
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
     * <b>description</b> :
     * <p>If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the <a href="https://help.aliyun.com/document_detail/35150.html">EnableKey</a> operation to enable the CMK.
     * In this example, the CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code> is disabled.</p>
     * 
     * @param request DisableKeyRequest
     * @return DisableKeyResponse
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableKeyWithOptions(request, runtime);
    }

    /**
     * @param request EnableKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableKeyResponse
     */
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

    /**
     * @param request EnableKeyRequest
     * @return EnableKeyResponse
     */
    public EnableKeyResponse enableKey(EnableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  KMS uses the primary version of a specified CMK to encrypt data.</p>
     * <ul>
     * <li>Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.</li>
     * <li>When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the data key.</li>
     * </ul>
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
     * <b>description</b> :
     * <p>  KMS uses the primary version of a specified CMK to encrypt data.</p>
     * <ul>
     * <li>Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.</li>
     * <li>When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the data key.</li>
     * </ul>
     * 
     * @param request EncryptRequest
     * @return EncryptResponse
     */
    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
     * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
     * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * @param request ExportDataKeyRequest
     * @return ExportDataKeyResponse
     */
    public ExportDataKeyResponse exportDataKey(ExportDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you perform the following steps to import your data key to a cryptographic module:</p>
     * <ul>
     * <li>Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.</li>
     * <li>Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.</li>
     * <li>Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.<blockquote>
     * <p> The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.</p>
     * </blockquote>
     * </li>
     * </ul>
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
     * <b>description</b> :
     * <p>We recommend that you perform the following steps to import your data key to a cryptographic module:</p>
     * <ul>
     * <li>Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.</li>
     * <li>Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.</li>
     * <li>Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.<blockquote>
     * <p> The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request GenerateAndExportDataKeyRequest
     * @return GenerateAndExportDataKeyResponse
     */
    public GenerateAndExportDataKeyResponse generateAndExportDataKey(GenerateAndExportDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAndExportDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
     * We recommend that you locally encrypt data by performing the following steps:
     * 1\. Call the GenerateDataKey operation.
     * 2\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
     * 3\. Store the encrypted data together with the ciphertext of the data key that you obtain.
     * We recommend that you locally decrypt data by performing the following steps:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.</li>
     * <li>Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
     * In this example, a random data key is generated for the CMK whose ID is <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>生成一个数据密钥</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
     * We recommend that you locally encrypt data by performing the following steps:
     * 1\. Call the GenerateDataKey operation.
     * 2\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
     * 3\. Store the encrypted data together with the ciphertext of the data key that you obtain.
     * We recommend that you locally decrypt data by performing the following steps:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.</li>
     * <li>Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
     * In this example, a random data key is generated for the CMK whose ID is <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>生成一个数据密钥</p>
     * 
     * @param request GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     */
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.</p>
     * <blockquote>
     * <ul>
     * <li>This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the ciphertext of the data key.</li>
     * <li>This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key, which can be used to encrypt local data.</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.</p>
     * <blockquote>
     * <ul>
     * <li>This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the ciphertext of the data key.</li>
     * <li>This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key, which can be used to encrypt local data.</p>
     * 
     * @param request GenerateDataKeyWithoutPlaintextRequest
     * @return GenerateDataKeyWithoutPlaintextResponse
     */
    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyWithoutPlaintextWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.</p>
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
     * <b>description</b> :
     * <p>In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.</p>
     * 
     * @param request GetCertificateRequest
     * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a client key.</p>
     * 
     * @param request GetClientKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientKeyResponse
     */
    public GetClientKeyResponse getClientKeyWithOptions(GetClientKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a client key.</p>
     * 
     * @param request GetClientKeyRequest
     * @return GetClientKeyResponse
     */
    public GetClientKeyResponse getClientKey(GetClientKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取默认KMS实例</p>
     * 
     * @param request GetDefaultKmsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDefaultKmsInstanceResponse
     */
    public GetDefaultKmsInstanceResponse getDefaultKmsInstanceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultKmsInstance"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultKmsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取默认KMS实例</p>
     * @return GetDefaultKmsInstanceResponse
     */
    public GetDefaultKmsInstanceResponse getDefaultKmsInstance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultKmsInstanceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>仅可查询名称为 default 的 Key Policy，否则提示 Not Found。</p>
     * 
     * @param request GetKeyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKeyPolicyResponse
     */
    public GetKeyPolicyResponse getKeyPolicyWithOptions(GetKeyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeyPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>仅可查询名称为 default 的 Key Policy，否则提示 Not Found。</p>
     * 
     * @param request GetKeyPolicyRequest
     * @return GetKeyPolicyResponse
     */
    public GetKeyPolicyResponse getKeyPolicy(GetKeyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Key Management Service (KMS) instance.</p>
     * 
     * @param request GetKmsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKmsInstanceResponse
     */
    public GetKmsInstanceResponse getKmsInstanceWithOptions(GetKmsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKmsInstance"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKmsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Key Management Service (KMS) instance.</p>
     * 
     * @param request GetKmsInstanceRequest
     * @return GetKmsInstanceResponse
     */
    public GetKmsInstanceResponse getKmsInstance(GetKmsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKmsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例配额信息</p>
     * 
     * @param request GetKmsInstanceQuotaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKmsInstanceQuotaInfosResponse
     */
    public GetKmsInstanceQuotaInfosResponse getKmsInstanceQuotaInfosWithOptions(GetKmsInstanceQuotaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKmsInstanceQuotaInfos"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKmsInstanceQuotaInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例配额信息</p>
     * 
     * @param request GetKmsInstanceQuotaInfosRequest
     * @return GetKmsInstanceQuotaInfosResponse
     */
    public GetKmsInstanceQuotaInfosResponse getKmsInstanceQuotaInfos(GetKmsInstanceQuotaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKmsInstanceQuotaInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The returned parameters can be used to call the <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial">ImportKeyMaterial</a> operation.</p>
     * <ul>
     * <li>You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.</li>
     * <li>The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.</li>
     * <li>The public key and token that are returned vary each time you call the GetParametersForImport operation.</li>
     * <li>You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   <table>
     * <thead>
     * <tr>
     * <th>Public key type</th>
     * <th>Encryption algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_PKCS1_V1_5</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>CMKs of all regions and all protection levels are supported.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview">Overview of Managed HSM</a>.</td>
     * </tr>
     * <tr>
     * <td>For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material">Import key material</a>. This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is <code>1234abcd-12ab-34cd-56ef-12345678****</code>, the encryption algorithm is <code>RSAES_PKCS1_V1_5</code>, and the public key is of the <code>RSA_2048</code> type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the parameters that are used to import key material for a customer master key (CMK).</p>
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
     * <b>description</b> :
     * <p>The returned parameters can be used to call the <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial">ImportKeyMaterial</a> operation.</p>
     * <ul>
     * <li>You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.</li>
     * <li>The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.</li>
     * <li>The public key and token that are returned vary each time you call the GetParametersForImport operation.</li>
     * <li>You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   <table>
     * <thead>
     * <tr>
     * <th>Public key type</th>
     * <th>Encryption algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_PKCS1_V1_5</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>CMKs of all regions and all protection levels are supported.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview">Overview of Managed HSM</a>.</td>
     * </tr>
     * <tr>
     * <td>For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material">Import key material</a>. This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is <code>1234abcd-12ab-34cd-56ef-12345678****</code>, the encryption algorithm is <code>RSAES_PKCS1_V1_5</code>, and the public key is of the <code>RSA_2048</code> type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the parameters that are used to import key material for a customer master key (CMK).</p>
     * 
     * @param request GetParametersForImportRequest
     * @return GetParametersForImportResponse
     */
    public GetParametersForImportResponse getParametersForImport(GetParametersForImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParametersForImportWithOptions(request, runtime);
    }

    /**
     * @param request GetPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublicKeyResponse
     */
    public GetPublicKeyResponse getPublicKeyWithOptions(GetPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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

    /**
     * @param request GetPublicKeyRequest
     * @return GetPublicKeyResponse
     */
    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicKeyWithOptions(request, runtime);
    }

    /**
     * @param request GetRandomPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRandomPasswordResponse
     */
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

    /**
     * @param request GetRandomPasswordRequest
     * @return GetRandomPasswordResponse
     */
    public GetRandomPasswordResponse getRandomPassword(GetRandomPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRandomPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>仅可查询名称为 default 的 Secret Policy，否则提示 Not Found。</p>
     * 
     * @param request GetSecretPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretPolicyResponse
     */
    public GetSecretPolicyResponse getSecretPolicyWithOptions(GetSecretPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>仅可查询名称为 default 的 Secret Policy，否则提示 Not Found。</p>
     * 
     * @param request GetSecretPolicyRequest
     * @return GetSecretPolicyResponse
     */
    public GetSecretPolicyResponse getSecretPolicy(GetSecretPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
     * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the <code>kms:Decrypt</code> permission on the CMK to call the GetSecretValue operation.
     * In this example, the value of the secret named <code>secret001</code> is obtained. The secret value is returned in the <code>SecretData</code> parameter. The secret value is <code>testdata1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>调用GetSecretValue接口获取凭据值。</p>
     * 
     * @param request GetSecretValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValueWithOptions(GetSecretValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
     * <b>description</b> :
     * <p>If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
     * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the <code>kms:Decrypt</code> permission on the CMK to call the GetSecretValue operation.
     * In this example, the value of the secret named <code>secret001</code> is obtained. The secret value is returned in the <code>SecretData</code> parameter. The secret value is <code>testdata1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>调用GetSecretValue接口获取凭据值。</p>
     * 
     * @param request GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValue(GetSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretValueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> when creating a CMK, you can select its key material source as external. <strong>Origin</strong> set to <strong>EXTERNAL</strong>. This API is used to import the key material into the CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, you need to call the <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> obtain the parameters required to import the key material, including the public key and import token.<blockquote>
     * <ul>
     * <li>The key type of the pair is <strong>Aliyun_AES_256</strong> the key material must be 256 bits. The key type must be <strong>Aliyun_SM4</strong> the CMK and key material must be 128 bits.</li>
     * <li>You can set the expiration time for the key material, or you can set it to never expire.</li>
     * <li>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</li>
     * <li>After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.</li>
     * <li>A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the ImportKeyMaterial operation to import the key material.</p>
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
     * <b>description</b> :
     * <p>Call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> when creating a CMK, you can select its key material source as external. <strong>Origin</strong> set to <strong>EXTERNAL</strong>. This API is used to import the key material into the CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, you need to call the <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> obtain the parameters required to import the key material, including the public key and import token.<blockquote>
     * <ul>
     * <li>The key type of the pair is <strong>Aliyun_AES_256</strong> the key material must be 256 bits. The key type must be <strong>Aliyun_SM4</strong> the CMK and key material must be 128 bits.</li>
     * <li>You can set the expiration time for the key material, or you can set it to never expire.</li>
     * <li>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</li>
     * <li>After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.</li>
     * <li>A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the ImportKeyMaterial operation to import the key material.</p>
     * 
     * @param request ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyMaterialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all aliases in the current region for the current account.</p>
     * 
     * @param request ListAliasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAliasesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all aliases in the current region for the current account.</p>
     * 
     * @param request ListAliasesRequest
     * @return ListAliasesResponse
     */
    public ListAliasesResponse listAliases(ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesWithOptions(request, runtime);
    }

    /**
     * @param request ListAliasesByKeyIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAliasesByKeyIdResponse
     */
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

    /**
     * @param request ListAliasesByKeyIdRequest
     * @return ListAliasesByKeyIdResponse
     */
    public ListAliasesByKeyIdResponse listAliasesByKeyId(ListAliasesByKeyIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesByKeyIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of application access points (AAPs).</p>
     * 
     * @param request ListApplicationAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationAccessPointsResponse
     */
    public ListApplicationAccessPointsResponse listApplicationAccessPointsWithOptions(ListApplicationAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListApplicationAccessPoints"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationAccessPointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of application access points (AAPs).</p>
     * 
     * @param request ListApplicationAccessPointsRequest
     * @return ListApplicationAccessPointsResponse
     */
    public ListApplicationAccessPointsResponse listApplicationAccessPoints(ListApplicationAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationAccessPointsWithOptions(request, runtime);
    }

    /**
     * @param request ListClientKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientKeysResponse
     */
    public ListClientKeysResponse listClientKeysWithOptions(ListClientKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientKeys"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientKeysResponse());
    }

    /**
     * @param request ListClientKeysRequest
     * @return ListClientKeysResponse
     */
    public ListClientKeysResponse listClientKeys(ListClientKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all versions of a specified CMK.</p>
     * 
     * @param request ListKeyVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKeyVersionsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all versions of a specified CMK.</p>
     * 
     * @param request ListKeyVersionsRequest
     * @return ListKeyVersionsResponse
     */
    public ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeyVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all customer master keys (CMKs) of the current Alibaba Cloud account in the current region.</p>
     * 
     * @param request ListKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKeysResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all customer master keys (CMKs) of the current Alibaba Cloud account in the current region.</p>
     * 
     * @param request ListKeysRequest
     * @return ListKeysResponse
     */
    public ListKeysResponse listKeys(ListKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Key Management Service (KMS) instances.</p>
     * 
     * @param request ListKmsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKmsInstancesResponse
     */
    public ListKmsInstancesResponse listKmsInstancesWithOptions(ListKmsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListKmsInstances"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKmsInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Key Management Service (KMS) instances.</p>
     * 
     * @param request ListKmsInstancesRequest
     * @return ListKmsInstancesResponse
     */
    public ListKmsInstancesResponse listKmsInstances(ListKmsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKmsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of access control rules.</p>
     * 
     * @param request ListNetworkRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkRulesResponse
     */
    public ListNetworkRulesResponse listNetworkRulesWithOptions(ListNetworkRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListNetworkRules"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of access control rules.</p>
     * 
     * @param request ListNetworkRulesRequest
     * @return ListNetworkRulesResponse
     */
    public ListNetworkRulesResponse listNetworkRules(ListNetworkRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of permission policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListPolicies"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of permission policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request format: KeyId=&quot;string&quot;</p>
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
     * <b>description</b> :
     * <p>Request format: KeyId=&quot;string&quot;</p>
     * 
     * @param request ListResourceTagsRequest
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.</p>
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
     * <b>description</b> :
     * <p>The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.</p>
     * 
     * @param request ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     */
    public ListSecretVersionIdsResponse listSecretVersionIds(ListSecretVersionIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretVersionIdsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
     * <ul>
     * <li>true: returns the resource tags.</li>
     * <li>false: does not return the resource tags. This is the default value.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
     * <ul>
     * <li>true: returns the resource tags.</li>
     * <li>false: does not return the resource tags. This is the default value.</li>
     * </ul>
     * 
     * @param request ListSecretsRequest
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of a key or a secret.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of a key or a secret.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>KMS is a paid service. For more information about the billing method, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing">Billing description</a>.</li>
     * <li>An Alibaba Cloud account can activate KMS only once.</li>
     * <li>Make sure that your Alibaba Cloud account has passed real-name authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Key Management Service (KMS) under your Alibaba cloud account.</p>
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
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>KMS is a paid service. For more information about the billing method, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing">Billing description</a>.</li>
     * <li>An Alibaba Cloud account can activate KMS only once.</li>
     * <li>Make sure that your Alibaba Cloud account has passed real-name authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Key Management Service (KMS) under your Alibaba cloud account.</p>
     * @return OpenKmsServiceResponse
     */
    public OpenKmsServiceResponse openKmsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openKmsServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
     * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
     * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:</p>
     * <ul>
     * <li>If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.</li>
     * <li>If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.</li>
     * <li>If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
     * Limits: This operation is available only for standard secrets.
     * In this example, the secret value of a new version is stored into the <code>secret001</code> secret. The <code>VersionId</code> parameter is set to <code>00000000000000000000000000000000203</code> as the new version, and the <code>SecretData</code> parameter is set to <code>importantdata</code>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
     * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
     * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:</p>
     * <ul>
     * <li>If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.</li>
     * <li>If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.</li>
     * <li>If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
     * Limits: This operation is available only for standard secrets.
     * In this example, the secret value of a new version is stored into the <code>secret001</code> secret. The <code>VersionId</code> parameter is set to <code>00000000000000000000000000000000203</code> as the new version, and the <code>SecretData</code> parameter is set to <code>importantdata</code>.</li>
     * </ul>
     * 
     * @param request PutSecretValueRequest
     * @return PutSecretValueResponse
     */
    public PutSecretValueResponse putSecretValue(PutSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putSecretValueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation in the following scenarios:</p>
     * <ul>
     * <li>After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Configure automatic key rotation</a>.</li>
     * <li>The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.</li>
     * <li>You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
     * To use the ReEncrypt operation, you must have two permissions:</li>
     * <li>kms:ReEncryptFrom on the source CMK</li>
     * <li>kms:ReEncryptTo on the destination CMK</li>
     * <li>For simplicity, you can specify kms:ReEncrypt\* to allow both of the preceding permissions.</li>
     * </ul>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
     * <b>description</b> :
     * <p>You can call this operation in the following scenarios:</p>
     * <ul>
     * <li>After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Configure automatic key rotation</a>.</li>
     * <li>The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.</li>
     * <li>You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
     * To use the ReEncrypt operation, you must have two permissions:</li>
     * <li>kms:ReEncryptFrom on the source CMK</li>
     * <li>kms:ReEncryptTo on the destination CMK</li>
     * <li>For simplicity, you can specify kms:ReEncrypt\* to allow both of the preceding permissions.</li>
     * </ul>
     * 
     * @param request ReEncryptRequest
     * @return ReEncryptResponse
     */
    public ReEncryptResponse reEncrypt(ReEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reEncryptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>仅后付费实例支持释放，预付费实例需要从用户中心-退订管理释放。</p>
     * 
     * @param request ReleaseKmsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseKmsInstanceResponse
     */
    public ReleaseKmsInstanceResponse releaseKmsInstanceWithOptions(ReleaseKmsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDeleteWithoutBackup)) {
            query.put("ForceDeleteWithoutBackup", request.forceDeleteWithoutBackup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseKmsInstance"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseKmsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>仅后付费实例支持释放，预付费实例需要从用户中心-退订管理释放。</p>
     * 
     * @param request ReleaseKmsInstanceRequest
     * @return ReleaseKmsInstanceResponse
     */
    public ReleaseKmsInstanceResponse releaseKmsInstance(ReleaseKmsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseKmsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can only use this operation to restore a deleted secret that is within its recovery period. If you set <strong>ForceDeleteWithoutRecovery</strong> to <strong>true</strong> when you delete the secret, you cannot restore it.</p>
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
     * <b>description</b> :
     * <p>You can only use this operation to restore a deleted secret that is within its recovery period. If you set <strong>ForceDeleteWithoutRecovery</strong> to <strong>true</strong> when you delete the secret, you cannot restore it.</p>
     * 
     * @param request RestoreSecretRequest
     * @return RestoreSecretResponse
     */
    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limits:
     * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
     * • The RotateSecret operation is unavailable for standard secrets.
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.</p>
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
     * <b>description</b> :
     * <p>Limits:
     * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
     * • The RotateSecret operation is unavailable for standard secrets.
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.</p>
     * 
     * @param request RotateSecretRequest
     * @return RotateSecretResponse
     */
    public RotateSecretResponse rotateSecret(RotateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rotateSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
     * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the <a href="https://help.aliyun.com/document_detail/35151.html">DisableKey</a> operation to disable the CMK.
     * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the <a href="https://help.aliyun.com/document_detail/44197.html">CancelKeyDeletion</a> operation to cancel the key deletion task before the scheduled period ends.</p>
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
     * <b>description</b> :
     * <p>During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
     * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the <a href="https://help.aliyun.com/document_detail/35151.html">DisableKey</a> operation to disable the CMK.
     * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the <a href="https://help.aliyun.com/document_detail/44197.html">CancelKeyDeletion</a> operation to cancel the key deletion task before the scheduled period ends.</p>
     * 
     * @param request ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     */
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scheduleKeyDeletionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.</p>
     * <ul>
     * <li>Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK status, which is specified by the KeyState parameter.
     * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is <code>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</code> by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables deletion protection for a customer master key (CMK).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
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
     * <b>description</b> :
     * <p>  After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.</p>
     * <ul>
     * <li>Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK status, which is specified by the KeyState parameter.
     * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is <code>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</code> by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables deletion protection for a customer master key (CMK).</p>
     * 
     * @param request SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    public SetDeletionProtectionResponse setDeletionProtection(SetDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>可以设置一条 Key Policy，且名称必须为 default。</p>
     * 
     * @param request SetKeyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetKeyPolicyResponse
     */
    public SetKeyPolicyResponse setKeyPolicyWithOptions(SetKeyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetKeyPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetKeyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>可以设置一条 Key Policy，且名称必须为 default。</p>
     * 
     * @param request SetKeyPolicyRequest
     * @return SetKeyPolicyResponse
     */
    public SetKeyPolicyResponse setKeyPolicy(SetKeyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setKeyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>可以设置一条 Secret Policy，且名称必须为 default。</p>
     * 
     * @param request SetSecretPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSecretPolicyResponse
     */
    public SetSecretPolicyResponse setSecretPolicyWithOptions(SetSecretPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSecretPolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSecretPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>可以设置一条 Secret Policy，且名称必须为 default。</p>
     * 
     * @param request SetSecretPolicyRequest
     * @return SetSecretPolicyResponse
     */
    public SetSecretPolicyResponse setSecretPolicy(SetSecretPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSecretPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can add up to 10 tags to a CMK, secret, or certificate.
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
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
     * <b>description</b> :
     * <p>You can add up to 10 tags to a CMK, secret, or certificate.
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * @param request TagResourceRequest
     * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to keys or secrets.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to keys or secrets.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).
     * You need to specify only the tag keys, not the tag values.
     * Each tag key must be 1 to 128 bytes in length.</p>
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
     * <b>description</b> :
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).
     * You need to specify only the tag keys, not the tag values.
     * Each tag key must be 1 to 128 bytes in length.</p>
     * 
     * @param request UntagResourceRequest
     * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can remove multiple tags from multiple keys or multiple secrets at a time. You cannot remove tags that start with aliyun or acs:.
     * If you enter multiple tag keys in the request parameters and only some of the tag keys are associated with resources, the operation can be called and the tags whose keys are associated with resources are removed from the resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from keys or secrets.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can remove multiple tags from multiple keys or multiple secrets at a time. You cannot remove tags that start with aliyun or acs:.
     * If you enter multiple tag keys in the request parameters and only some of the tag keys are associated with resources, the operation can be called and the tags whose keys are associated with resources are removed from the resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from keys or secrets.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAliasResponse
     */
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

    /**
     * @param request UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAliasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The update takes effect immediately after an AAP information is updated. Exercise caution when you perform this operation. You can update the description of an AAP and the permission policies that are associated with the AAP. You cannot update the name of the AAP.</p>
     * 
     * @param request UpdateApplicationAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationAccessPointResponse
     */
    public UpdateApplicationAccessPointResponse updateApplicationAccessPointWithOptions(UpdateApplicationAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policies)) {
            query.put("Policies", request.policies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationAccessPoint"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>The update takes effect immediately after an AAP information is updated. Exercise caution when you perform this operation. You can update the description of an AAP and the permission policies that are associated with the AAP. You cannot update the name of the AAP.</p>
     * 
     * @param request UpdateApplicationAccessPointRequest
     * @return UpdateApplicationAccessPointResponse
     */
    public UpdateApplicationAccessPointResponse updateApplicationAccessPoint(UpdateApplicationAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the status of the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is updated to INACTIVE.</p>
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
     * <b>description</b> :
     * <p>In this example, the status of the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is updated to INACTIVE.</p>
     * 
     * @param request UpdateCertificateStatusRequest
     * @return UpdateCertificateStatusResponse
     */
    public UpdateCertificateStatusResponse updateCertificateStatus(UpdateCertificateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCertificateStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. You can call this operation to add, modify, or delete the description of a CMK.</p>
     * 
     * <b>summary</b> : 
     * <p>调用UpdateKeyDescription接口更新主密钥的描述信息。</p>
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
     * <b>description</b> :
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. You can call this operation to add, modify, or delete the description of a CMK.</p>
     * 
     * <b>summary</b> : 
     * <p>调用UpdateKeyDescription接口更新主密钥的描述信息。</p>
     * 
     * @param request UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKeyDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If your own applications are deployed in multiple VPCs in the same region, you can associate the VPCs except the VPC in which the KMS instance resides with the KMS instance. This topic describes how to configure the VPCs.
     * The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, the applications in these VPCs can access the KMS instance.</p>
     * <blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitches of other Alibaba Cloud accounts with the Alibaba Cloud account to which the KMS instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the virtual private cloud (VPC) that is associated with a Key Management Service (KMS) instance.</p>
     * 
     * @param request UpdateKmsInstanceBindVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKmsInstanceBindVpcResponse
     */
    public UpdateKmsInstanceBindVpcResponse updateKmsInstanceBindVpcWithOptions(UpdateKmsInstanceBindVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindVpcs)) {
            query.put("BindVpcs", request.bindVpcs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKmsInstanceBindVpc"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKmsInstanceBindVpcResponse());
    }

    /**
     * <b>description</b> :
     * <p>If your own applications are deployed in multiple VPCs in the same region, you can associate the VPCs except the VPC in which the KMS instance resides with the KMS instance. This topic describes how to configure the VPCs.
     * The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, the applications in these VPCs can access the KMS instance.</p>
     * <blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitches of other Alibaba Cloud accounts with the Alibaba Cloud account to which the KMS instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the virtual private cloud (VPC) that is associated with a Key Management Service (KMS) instance.</p>
     * 
     * @param request UpdateKmsInstanceBindVpcRequest
     * @return UpdateKmsInstanceBindVpcResponse
     */
    public UpdateKmsInstanceBindVpcResponse updateKmsInstanceBindVpc(UpdateKmsInstanceBindVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKmsInstanceBindVpcWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update only private IP addresses and description of an access control rule. You cannot update the name and network type of an access control rule.</li>
     * <li>Updating an access control rule affects all permission policies that are bound to the access control rule. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an access control rule.</p>
     * 
     * @param request UpdateNetworkRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkRuleResponse
     */
    public UpdateNetworkRuleResponse updateNetworkRuleWithOptions(UpdateNetworkRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePrivateIp)) {
            query.put("SourcePrivateIp", request.sourcePrivateIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetworkRule"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkRuleResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update only private IP addresses and description of an access control rule. You cannot update the name and network type of an access control rule.</li>
     * <li>Updating an access control rule affects all permission policies that are bound to the access control rule. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an access control rule.</p>
     * 
     * @param request UpdateNetworkRuleRequest
     * @return UpdateNetworkRuleResponse
     */
    public UpdateNetworkRuleResponse updateNetworkRule(UpdateNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update the role-based access control (RBAC) permissions, accessible resources, access control rules, and description of a permission policy. You cannot update the name or scope of a permission policy.</li>
     * <li>Updating a permission policy affects all application access points (AAPs) that are bound to the permission policy. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新一个权限策略</p>
     * 
     * @param request UpdatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicyWithOptions(UpdatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlRules)) {
            query.put("AccessControlRules", request.accessControlRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            query.put("Permissions", request.permissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicy"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update the role-based access control (RBAC) permissions, accessible resources, access control rules, and description of a permission policy. You cannot update the name or scope of a permission policy.</li>
     * <li>Updating a permission policy affects all application access points (AAPs) that are bound to the permission policy. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新一个权限策略</p>
     * 
     * @param request UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
     * An automatic key rotation policy cannot be configured for the following keys:</p>
     * <ul>
     * <li>Asymmetric key</li>
     * <li>Service-managed key</li>
     * <li>Bring your own key (BYOK) that is imported into KMS</li>
     * <li>Key that is not in the <strong>Enabled</strong> state
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
     * An automatic key rotation policy cannot be configured for the following keys:</p>
     * <ul>
     * <li>Asymmetric key</li>
     * <li>Service-managed key</li>
     * <li>Bring your own key (BYOK) that is imported into KMS</li>
     * <li>Key that is not in the <strong>Enabled</strong> state
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.</li>
     * </ul>
     * 
     * @param request UpdateRotationPolicyRequest
     * @return UpdateRotationPolicyResponse
     */
    public UpdateRotationPolicyResponse updateRotationPolicy(UpdateRotationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRotationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the metadata of the <code>secret001</code> secret is updated. The <code>Description</code> parameter is set to <code>datainfo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the metadata of a secret.</p>
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
     * <b>description</b> :
     * <p>In this example, the metadata of the <code>secret001</code> secret is updated. The <code>Description</code> parameter is set to <code>datainfo</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the metadata of a secret.</p>
     * 
     * @param request UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
     * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
     * In this example, the rotation policy of the <code>RdsSecret/Mysql5.4/MyCred</code> secret is updated. The following settings are modified:</p>
     * <ul>
     * <li>The <code>EnableAutomaticRotation</code> parameter is set to <code>true</code>, which indicates that automatic rotation is enabled.</li>
     * <li>The <code>RotationInterval</code> parameter is set to <code>30d</code>, which indicates that the interval for automatic rotation is 30 days.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
     * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
     * In this example, the rotation policy of the <code>RdsSecret/Mysql5.4/MyCred</code> secret is updated. The following settings are modified:</p>
     * <ul>
     * <li>The <code>EnableAutomaticRotation</code> parameter is set to <code>true</code>, which indicates that automatic rotation is enabled.</li>
     * <li>The <code>RotationInterval</code> parameter is set to <code>30d</code>, which indicates that the interval for automatic rotation is 30 days.</li>
     * </ul>
     * 
     * @param request UpdateSecretRotationPolicyRequest
     * @return UpdateSecretRotationPolicyResponse
     */
    public UpdateSecretRotationPolicyResponse updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretRotationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the stage label that marks a secret version.</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateSecretVersionStage</p>
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
     * <b>description</b> :
     * <p>Updates the stage label that marks a secret version.</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateSecretVersionStage</p>
     * 
     * @param request UpdateSecretVersionStageRequest
     * @return UpdateSecretVersionStageResponse
     */
    public UpdateSecretVersionStageResponse updateSecretVersionStage(UpdateSecretVersionStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretVersionStageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is <code>12345678-1234-1234-1234-12345678****</code>.</p>
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
     * <b>description</b> :
     * <p>In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is <code>12345678-1234-1234-1234-12345678****</code>.</p>
     * 
     * @param request UploadCertificateRequest
     * @return UploadCertificateResponse
     */
    public UploadCertificateResponse uploadCertificate(UploadCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCertificateWithOptions(request, runtime);
    }
}
