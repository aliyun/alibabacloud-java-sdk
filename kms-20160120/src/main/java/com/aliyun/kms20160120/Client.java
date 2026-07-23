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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "kms.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "kms.us-east-1.aliyuncs.com"),
            new TeaPair("me-east-1", "kms.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "kms.me-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "kms.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "kms.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "kms.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "kms.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "kms.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "kms.cn-wuhan-lr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "kms.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "kms.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "kms.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "kms.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "kms.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "kms.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "kms.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-heyuan", "kms.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "kms.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "kms.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "kms.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "kms.cn-fuzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "kms.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "kms.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "kms.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "kms.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "kms.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "kms.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "kms.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "kms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "kms.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "kms.ap-northeast-1.aliyuncs.com")
        );
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway, the queries per second (QPS) limit for each Alibaba Cloud account is 200. If the QPS exceeds the limit, the API call is throttled. This can affect your business. We recommend that you plan your calls to avoid exceeding this limit.</li>
     * <li>If you use a dedicated gateway, the QPS limit for each Alibaba Cloud account is subject to the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table describes the supported encryption algorithms.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Ciphertext length (bytes)</th>
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
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>Maximum 6,144</td>
     * </tr>
     * <tr>
     * <td>This topic provides an example of how to use the asymmetric key whose ID is <code>key-hzz630494463ejqjx****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code> using the <code>RSAES_OAEP_SHA_1</code> decryption algorithm.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using the private key of an asymmetric CMK.</p>
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
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway, the queries per second (QPS) limit for each Alibaba Cloud account is 200. If the QPS exceeds the limit, the API call is throttled. This can affect your business. We recommend that you plan your calls to avoid exceeding this limit.</li>
     * <li>If you use a dedicated gateway, the QPS limit for each Alibaba Cloud account is subject to the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table describes the supported encryption algorithms.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Ciphertext length (bytes)</th>
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
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>Maximum 6,144</td>
     * </tr>
     * <tr>
     * <td>This topic provides an example of how to use the asymmetric key whose ID is <code>key-hzz630494463ejqjx****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code> using the <code>RSAES_OAEP_SHA_1</code> decryption algorithm.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Decrypts data by using the private key of an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the permissions that are required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access a key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway: The number of queries per second (QPS) for a single user is limited to 200. If the limit is exceeded, API calls are throttled. This may affect your business. We recommend that you plan your API calls to avoid exceeding this limit.</li>
     * <li>If you use a dedicated gateway: The QPS limit for a single user depends on the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys that have the <strong>Usage</strong> parameter set to <strong>ENCRYPT/DECRYPT</strong>. The following table describes the supported encryption algorithms.</p>
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
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>In this example, the plaintext <code>SGVsbG8gd29ybGQ=</code> is encrypted using an asymmetric key with the key ID <code>key-hzz630494463ejqjx****</code>, the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>, and the <code>RSAES_OAEP_SHA_1</code> encryption algorithm.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using the public key of an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the permissions that are required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access a key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway: The number of queries per second (QPS) for a single user is limited to 200. If the limit is exceeded, API calls are throttled. This may affect your business. We recommend that you plan your API calls to avoid exceeding this limit.</li>
     * <li>If you use a dedicated gateway: The QPS limit for a single user depends on the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys that have the <strong>Usage</strong> parameter set to <strong>ENCRYPT/DECRYPT</strong>. The following table describes the supported encryption algorithms.</p>
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
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>In this example, the plaintext <code>SGVsbG8gd29ybGQ=</code> is encrypted using an asymmetric key with the key ID <code>key-hzz630494463ejqjx****</code>, the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>, and the <code>RSAES_OAEP_SHA_1</code> encryption algorithm.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Encrypts data by using the public key of an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policies that are required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. This method requires you to enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Shared gateway: This operation is limited to 200 queries per second (QPS) for each user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * <li>Dedicated gateway: The QPS for each user is limited by the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms.</p>
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
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>According to the GB/T 32918.2 standard &quot;Information security technology - SM2 elliptic curve public key cryptography - Part 2: Digital signature algorithm&quot;, when you calculate an SM2 signature, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result of concatenating Z(A) and M. M is the original message to be signed. Z(A) is the hash value of user A, as defined in GB/T 32918.2.
     * This topic provides an example of how to use an asymmetric key with the key ID <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to sign the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=</code> using the <code>RSA_PSS_SHA_256</code> signature algorithm.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a digital signature by using an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policies that are required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. This method requires you to enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Shared gateway: This operation is limited to 200 queries per second (QPS) for each user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * <li>Dedicated gateway: The QPS for each user is limited by the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms.</p>
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
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>According to the GB/T 32918.2 standard &quot;Information security technology - SM2 elliptic curve public key cryptography - Part 2: Digital signature algorithm&quot;, when you calculate an SM2 signature, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result of concatenating Z(A) and M. M is the original message to be signed. Z(A) is the hash value of user A, as defined in GB/T 32918.2.
     * This topic provides an example of how to use an asymmetric key with the key ID <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and the key version ID <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> to sign the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuy****=</code> using the <code>RSA_PSS_SHA_256</code> signature algorithm.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a digital signature by using an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or through a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway, the queries per second (QPS) limit for this operation is 200 for a single user. If you exceed this limit, API calls are throttled, which may impact your business. We recommend that you manage your call frequency to stay within the QPS limit.</li>
     * <li>If you use a dedicated gateway, the QPS limit for this operation for a single user is determined by the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table lists the supported signature algorithms.</p>
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
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>In accordance with the GBT32918 standard, when an SM2 signature is calculated, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result generated by concatenating Z(A) and M. In this formula, M is the original message to be signed, and Z(A) is the hash value of user A as defined in GBT32918.
     * This topic provides an example of how to use an asymmetric key with the key ID \<code>5c438b18-05be-40ad-b6c2-3be6752c\\*\\*\\*\\*\\</code> and the key version ID \<code>2ab1a983-7072-4bbc-a582-584b5bd8\\*\\*\\*\\*\\</code> to verify the signature \<code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq\\*\\*\\*\\*==\\</code> for the digest \<code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=\\</code> using the RSA_PSS_SHA_256 signature algorithm.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies a digital signature by using the public key of an asymmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or through a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway, the queries per second (QPS) limit for this operation is 200 for a single user. If you exceed this limit, API calls are throttled, which may impact your business. We recommend that you manage your call frequency to stay within the QPS limit.</li>
     * <li>If you use a dedicated gateway, the QPS limit for this operation for a single user is determined by the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table lists the supported signature algorithms.</p>
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
     * <td>SM2 elliptic curve digital signature algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>In accordance with the GBT32918 standard, when an SM2 signature is calculated, the value of the <strong>Digest</strong> parameter is not the SM3 hash value of the original message. Instead, the value is the SM3 hash value of the result generated by concatenating Z(A) and M. In this formula, M is the original message to be signed, and Z(A) is the hash value of user A as defined in GBT32918.
     * This topic provides an example of how to use an asymmetric key with the key ID \<code>5c438b18-05be-40ad-b6c2-3be6752c\\*\\*\\*\\*\\</code> and the key version ID \<code>2ab1a983-7072-4bbc-a582-584b5bd8\\*\\*\\*\\*\\</code> to verify the signature \<code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq\\*\\*\\*\\*==\\</code> for the digest \<code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=\\</code> using the RSA_PSS_SHA_256 signature algorithm.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Verifies a digital signature by using the public key of an asymmetric CMK.</p>
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
     * <b>summary</b> : 
     * <p>Cancels the deletion task of a CMK.</p>
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
     * <b>summary</b> : 
     * <p>Cancels the deletion task of a CMK.</p>
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
     * <b>summary</b> : 
     * <p>Creates an alias for a key.</p>
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
     * <b>summary</b> : 
     * <p>Creates an alias for a key.</p>
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
     * <ul>
     * <li>For information about the access policies required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Alibaba Cloud Key Management Service (KMS) supports common specifications for symmetric and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key management types and key specifications</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a customer master key (CMK) for envelope encryption, digital signatures, or other cryptographic operations.</p>
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
     * <ul>
     * <li>For information about the access policies required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Alibaba Cloud Key Management Service (KMS) supports common specifications for symmetric and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key management types and key specifications</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a customer master key (CMK) for envelope encryption, digital signatures, or other cryptographic operations.</p>
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
     * <ul>
     * <li>You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</li>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a version for a customer master key (CMK).</p>
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
     * <ul>
     * <li>You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</li>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a version for a customer master key (CMK).</p>
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
     * <p>Creates a network access rule to configure the private IP addresses or private CIDR blocks that are allowed to access a Key Management Service (KMS) instance.</p>
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
     * <p>Creates a network access rule to configure the private IP addresses or private CIDR blocks that are allowed to access a Key Management Service (KMS) instance.</p>
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
     * <ul>
     * <li>For information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Specify the secret name, the secret value for the initial version, and the version number. The initial version is marked with the ACSCurrent stage label.</li>
     * <li>Key Management Service (KMS) uses the key that you specify to encrypt the secret value. The key and the secret must be in the same KMS instance. The key must be a symmetric key.<blockquote>
     * <p>KMS encrypts the secret value of each version. Metadata such as the secret name, version number, and version stage labels are not encrypted.</p>
     * </blockquote>
     * </li>
     * <li>Before you encrypt the secret value, you must have the <code>kms:GenerateDataKey</code> permission on the key.
     * This topic provides an example of how to create an RDS secret. The secret is named <code>mydbconninfo</code>. The <code>VersionId</code> of the initial version is <code>v1</code>. The <code>SecretData</code> is <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;user1&quot;,&quot;AccountPassword&quot;:&quot;****&quot;}]}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a secret and stores its initial version.</p>
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
     * <ul>
     * <li>For information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Specify the secret name, the secret value for the initial version, and the version number. The initial version is marked with the ACSCurrent stage label.</li>
     * <li>Key Management Service (KMS) uses the key that you specify to encrypt the secret value. The key and the secret must be in the same KMS instance. The key must be a symmetric key.<blockquote>
     * <p>KMS encrypts the secret value of each version. Metadata such as the secret name, version number, and version stage labels are not encrypted.</p>
     * </blockquote>
     * </li>
     * <li>Before you encrypt the secret value, you must have the <code>kms:GenerateDataKey</code> permission on the key.
     * This topic provides an example of how to create an RDS secret. The secret is named <code>mydbconninfo</code>. The <code>VersionId</code> of the initial version is <code>v1</code>. The <code>SecretData</code> is <code>{&quot;Accounts&quot;:[{&quot;AccountName&quot;:&quot;user1&quot;,&quot;AccountPassword&quot;:&quot;****&quot;}]}</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a secret and stores its initial version.</p>
     * 
     * @param request CreateSecretRequest
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. To use a shared gateway, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Shared gateway: The queries per second (QPS) limit for a single user for this operation is 1,000. If this limit is exceeded, API calls are throttled, which may affect your business. We recommend that you plan your calls accordingly.</li>
     * <li>Dedicated gateway: The QPS limit for a single user for this operation is subject to the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Decrypts ciphertext that was encrypted by using a CMK.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.recipient)) {
            query.put("Recipient", request.recipient);
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
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. To use a shared gateway, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Shared gateway: The queries per second (QPS) limit for a single user for this operation is 1,000. If this limit is exceeded, API calls are throttled, which may affect your business. We recommend that you plan your calls accordingly.</li>
     * <li>Dedicated gateway: The QPS limit for a single user for this operation is subject to the performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Decrypts ciphertext that was encrypted by using a CMK.</p>
     * 
     * @param request DecryptRequest
     * @return DecryptResponse
     */
    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alias.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an alias.</p>
     * 
     * @param request DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAliasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete an AAP, make sure that it is no longer in use. If you delete an AAP that is in use, related applications cannot access KMS. Proceed with caution.</li>
     * </ul>
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
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete an AAP, make sure that it is no longer in use. If you delete an AAP that is in use, related applications cannot access KMS. Proceed with caution.</li>
     * </ul>
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
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete a ClientKey, make sure that it is no longer in use. Deleting a ClientKey that is in use prevents related applications from accessing KMS. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a client key.</p>
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
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before you delete a ClientKey, make sure that it is no longer in use. Deleting a ClientKey that is in use prevents related applications from accessing KMS. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a client key.</p>
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
     * After you delete the key material, you can upload only the same key material into the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the imported key material from a CMK. After deletion, the CMK enters the PendingImport state until you re-import key material.</p>
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
     * After you delete the key material, you can upload only the same key material into the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the imported key material from a CMK. After deletion, the CMK enters the PendingImport state until you re-import key material.</p>
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
     * <ul>
     * <li>For information about the access policy that is required to call this OpenAPI as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before deleting the network control rule, ensure that it is not attached to any access policies. Otherwise, related applications cannot access KMS as expected.</li>
     * </ul>
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
     * <ul>
     * <li>For information about the access policy that is required to call this OpenAPI as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Before deleting the network control rule, ensure that it is not attached to any access policies. Otherwise, related applications cannot access KMS as expected.</li>
     * </ul>
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
     * <b>summary</b> : 
     * <p>Deletes a secret.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a secret.</p>
     * 
     * @param request DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of Key Management Service (KMS) within your Alibaba Cloud account.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of Key Management Service (KMS) within your Alibaba Cloud account.</p>
     * @return DescribeAccountKmsStatusResponse
     */
    public DescribeAccountKmsStatusResponse describeAccountKmsStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountKmsStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the access policy that a Resource Access Management (RAM) user or RAM role must have to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an application access point (AAP).</p>
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
     * <b>description</b> :
     * <p>For information about the access policy that a Resource Access Management (RAM) user or RAM role must have to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an application access point (AAP).</p>
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
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a CMK, such as the key state, usage, and rotation configuration.</p>
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
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a CMK, such as the key state, usage, and rotation configuration.</p>
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
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a specific CMK version.</p>
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
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the metadata of a specific CMK version.</p>
     * 
     * @param request DescribeKeyVersionRequest
     * @return DescribeKeyVersionResponse
     */
    public DescribeKeyVersionResponse describeKeyVersion(DescribeKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the required access policy for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a network access rule.</p>
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
     * <b>description</b> :
     * <p>For information about the required access policy for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a network access rule.</p>
     * 
     * @param request DescribeNetworkRuleRequest
     * @return DescribeNetworkRuleResponse
     */
    public DescribeNetworkRuleResponse describeNetworkRule(DescribeNetworkRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a permission policy.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a permission policy.</p>
     * 
     * @param request DescribePolicyRequest
     * @return DescribePolicyResponse
     */
    public DescribePolicyResponse describePolicy(DescribePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions where KMS is available.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the regions where KMS is available.</p>
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
     * <b>summary</b> : 
     * <p>Queries the metadata of a secret.</p>
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
     * <b>summary</b> : 
     * <p>Queries the metadata of a secret.</p>
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
     * <b>summary</b> : 
     * <p>Disables a key.</p>
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
     * <b>summary</b> : 
     * <p>Disables a key.</p>
     * 
     * @param request DisableKeyRequest
     * @return DisableKeyResponse
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a key to encrypt and decrypt data.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Enables a key to encrypt and decrypt data.</p>
     * 
     * @param request EnableKeyRequest
     * @return EnableKeyResponse
     */
    public EnableKeyResponse enableKey(EnableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required to allow a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To use this method, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>When accessed through a shared gateway, the queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, requests are throttled, which can affect your business. We recommend that you stay within this limit to avoid throttling.</li>
     * <li>When accessed through a dedicated gateway, the QPS limit for a single user is subject to the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>KMS encrypts the specified data using the primary version of a specified key.</li>
     * <li>You can encrypt a maximum of 6 KB of data, such as an RSA key, a database password, or other sensitive information.</li>
     * <li>If you migrate encrypted data from one region to another, you can call the Encrypt operation in the destination region to re-encrypt the plaintext data key from the source region. This generates a new encrypted data key. You can then call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt this new key in the destination region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Encrypts plaintext by using a symmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required to allow a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To use this method, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>When accessed through a shared gateway, the queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, requests are throttled, which can affect your business. We recommend that you stay within this limit to avoid throttling.</li>
     * <li>When accessed through a dedicated gateway, the QPS limit for a single user is subject to the computing performance specifications of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>KMS encrypts the specified data using the primary version of a specified key.</li>
     * <li>You can encrypt a maximum of 6 KB of data, such as an RSA key, a database password, or other sensitive information.</li>
     * <li>If you migrate encrypted data from one region to another, you can call the Encrypt operation in the destination region to re-encrypt the plaintext data key from the source region. This generates a new encrypted data key. You can then call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt this new key in the destination region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Encrypts plaintext by using a symmetric CMK.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS using the public endpoint or a VPC endpoint. To use the public endpoint, you must first enable it. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access the key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of the KMS instance: <code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to obtain a data key encrypted by a master key (CMK), you can use the ExportDataKey operation to distribute the data key to other regions or cryptographic modules. The ExportDataKey operation returns the ciphertext of the data key, re-encrypted with the specified public key.
     * You can import the exported ciphertext into the cryptographic module that holds the corresponding private key. This process lets you securely distribute the data key from KMS to a cryptographic module. After the data key is imported into the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports a data key encrypted by a CMK. The data key is re-encrypted by a public key that you specify for secure transmission.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS using the public endpoint or a VPC endpoint. To use the public endpoint, you must first enable it. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access the key in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of the KMS instance: <code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to obtain a data key encrypted by a master key (CMK), you can use the ExportDataKey operation to distribute the data key to other regions or cryptographic modules. The ExportDataKey operation returns the ciphertext of the data key, re-encrypted with the specified public key.
     * You can import the exported ciphertext into the cryptographic module that holds the corresponding private key. This process lets you securely distribute the data key from KMS to a cryptographic module. After the data key is imported into the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports a data key encrypted by a CMK. The data key is re-encrypted by a public key that you specify for secure transmission.</p>
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
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>We recommend that you import the data key to a cryptographic module for data encryption and data decryption as follows:
     * 1\. Call the GenerateAndExportDataKey operation to obtain the data key encrypted by a KMS key and a specified public key.
     * 2\. Save the ciphertext of the data key that is encrypted by the KMS key to KMS or a storage service, such as ApsaraDB, for key backup and recovery.
     * 3\. Import the ciphertext of the data key that is encrypted by the public key to the cryptographic module that contains the corresponding private key. This process distributes the key from KMS to the cryptographic module. You can then use the data key to encrypt and decrypt data.</p>
     * <blockquote>
     * <p>The KMS key that you specify in the request is used only to encrypt the data key and is not used to generate the data key. KMS does not record or store the randomly generated data key. You are responsible for recording the data key or its ciphertext.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key, encrypts it by using a CMK and a public key that you specify, and returns both ciphertexts.</p>
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
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access KMS instances over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>We recommend that you import the data key to a cryptographic module for data encryption and data decryption as follows:
     * 1\. Call the GenerateAndExportDataKey operation to obtain the data key encrypted by a KMS key and a specified public key.
     * 2\. Save the ciphertext of the data key that is encrypted by the KMS key to KMS or a storage service, such as ApsaraDB, for key backup and recovery.
     * 3\. Import the ciphertext of the data key that is encrypted by the public key to the cryptographic module that contains the corresponding private key. This process distributes the key from KMS to the cryptographic module. You can then use the data key to encrypt and decrypt data.</p>
     * <blockquote>
     * <p>The KMS key that you specify in the request is used only to encrypt the data key and is not used to generate the data key. KMS does not record or store the randomly generated data key. You are responsible for recording the data key or its ciphertext.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key, encrypts it by using a CMK and a public key that you specify, and returns both ciphertexts.</p>
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
     * <ul>
     * <li>For information about the permissions that are required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called using a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway to call this operation, the queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, API calls are throttled. This may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * <li>If you use a dedicated gateway to call this operation, the QPS limit for a single user is based on the computing performance of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation generates a random data key, encrypts the data key using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to encrypt data locally and outside of KMS. When you store the encrypted data, you must also store the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext field and the ciphertext of the data key from the CiphertextBlob field in the response.
     * The CMK that you specify in the request is used only to encrypt the data key. It is not involved in the generation of the data key. KMS does not record or store the randomly generated data key. You are responsible for the persistence of the ciphertext of the data key.
     * We recommend that you perform the following steps to encrypt data locally:
     * 1\. Call the GenerateDataKey operation to obtain a data key for data encryption.
     * 2\. Use the plaintext of the data key returned in the Plaintext field of the response to encrypt data locally. Then, clear the plaintext of the data key from memory.
     * 3\. Store the ciphertext of the data key returned in the CiphertextBlob field of the response together with the encrypted data.
     * To decrypt data locally:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the stored ciphertext of the data key. This operation returns the plaintext of the data key.</li>
     * <li>Use the plaintext of the data key to decrypt data locally. Then, clear the plaintext of the data key from memory.
     * This topic provides an example of how to generate a random data key for a key with the ID <code>key-hzz630494463ejqjx****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key for envelope encryption. The data key is returned in both plaintext and ciphertext forms.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.recipient)) {
            query.put("Recipient", request.recipient);
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
     * <ul>
     * <li>For information about the permissions that are required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation can be called using a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or a VPC. To access KMS over the Internet, you must enable the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>If you use a shared gateway to call this operation, the queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, API calls are throttled. This may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * <li>If you use a dedicated gateway to call this operation, the QPS limit for a single user is based on the computing performance of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation generates a random data key, encrypts the data key using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to encrypt data locally and outside of KMS. When you store the encrypted data, you must also store the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext field and the ciphertext of the data key from the CiphertextBlob field in the response.
     * The CMK that you specify in the request is used only to encrypt the data key. It is not involved in the generation of the data key. KMS does not record or store the randomly generated data key. You are responsible for the persistence of the ciphertext of the data key.
     * We recommend that you perform the following steps to encrypt data locally:
     * 1\. Call the GenerateDataKey operation to obtain a data key for data encryption.
     * 2\. Use the plaintext of the data key returned in the Plaintext field of the response to encrypt data locally. Then, clear the plaintext of the data key from memory.
     * 3\. Store the ciphertext of the data key returned in the CiphertextBlob field of the response together with the encrypted data.
     * To decrypt data locally:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the stored ciphertext of the data key. This operation returns the plaintext of the data key.</li>
     * <li>Use the plaintext of the data key to decrypt data locally. Then, clear the plaintext of the data key from memory.
     * This topic provides an example of how to generate a random data key for a key with the ID <code>key-hzz630494463ejqjx****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key for envelope encryption. The data key is returned in both plaintext and ciphertext forms.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role needs to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS over the Internet or through a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The queries per second (QPS) limit for a single user is 1,000. If you exceed this limit, requests are throttled, which may affect your business. We recommend that you stay within this limit.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user depends on the computing performance of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Details</h3>
     * <p>This operation generates a random data key, encrypts it with a specified symmetric customer master key (CMK), and returns the ciphertext of the data key. This operation provides the same features as <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request is used only to encrypt the data key. It is not used to generate the data key. KMS does not record or store the randomly generated data key.</p>
     * <blockquote>
     * <ul>
     * <li><p>This operation is suitable for systems that do not need to immediately use the data key for data encryption. When encryption is required, the system calls the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> API to decrypt the ciphertext of the data key.</p>
     * </li>
     * <li><p>This operation is also suitable for distributed systems with different trust levels. For example, your system stores data in different partitions based on a defined policy. A module pre-creates these data partitions and generates a unique data key for each one. After this module initializes the control plane, it acts as a key distributor and does not produce or consume data. When data plane modules produce and consume data, they first retrieve the ciphertext of the data key for a partition. They then decrypt the ciphertext and use the plaintext data key to encrypt or decrypt data. Finally, they purge the plaintext data key from memory. In such a system, the key distributor does not need to access the plaintext of the data key. It only requires the \<code>GenerateDataKeyWithoutPlaintext\\</code> permission for the relevant CMK. Data producers and consumers do not need to generate new data keys. They only require the \<code>Decrypt\\</code> permission for the relevant CMK.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key in only ciphertext form, without the plaintext copy.</p>
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role needs to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible through a shared gateway or a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: Access KMS over the Internet or through a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>Calls through a shared gateway: The queries per second (QPS) limit for a single user is 1,000. If you exceed this limit, requests are throttled, which may affect your business. We recommend that you stay within this limit.</li>
     * <li>Calls through a dedicated gateway: The QPS limit for a single user depends on the computing performance of your KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/480120.html">Performance metrics</a>.</li>
     * </ul>
     * <h3>Details</h3>
     * <p>This operation generates a random data key, encrypts it with a specified symmetric customer master key (CMK), and returns the ciphertext of the data key. This operation provides the same features as <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a>. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request is used only to encrypt the data key. It is not used to generate the data key. KMS does not record or store the randomly generated data key.</p>
     * <blockquote>
     * <ul>
     * <li><p>This operation is suitable for systems that do not need to immediately use the data key for data encryption. When encryption is required, the system calls the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> API to decrypt the ciphertext of the data key.</p>
     * </li>
     * <li><p>This operation is also suitable for distributed systems with different trust levels. For example, your system stores data in different partitions based on a defined policy. A module pre-creates these data partitions and generates a unique data key for each one. After this module initializes the control plane, it acts as a key distributor and does not produce or consume data. When data plane modules produce and consume data, they first retrieve the ciphertext of the data key for a partition. They then decrypt the ciphertext and use the plaintext data key to encrypt or decrypt data. Finally, they purge the plaintext data key from memory. In such a system, the key distributor does not need to access the plaintext of the data key. It only requires the \<code>GenerateDataKeyWithoutPlaintext\\</code> permission for the relevant CMK. Data producers and consumers do not need to generate new data keys. They only require the \<code>Decrypt\\</code> permission for the relevant CMK.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a random data key in only ciphertext form, without the plaintext copy.</p>
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
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates an HMAC message authentication code for a message by using a specified key.</p>
     * 
     * @param request GenerateMacRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateMacResponse
     */
    public GenerateMacResponse generateMacWithOptions(GenerateMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateMac"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateMacResponse());
    }

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates an HMAC message authentication code for a message by using a specified key.</p>
     * 
     * @param request GenerateMacRequest
     * @return GenerateMacResponse
     */
    public GenerateMacResponse generateMac(GenerateMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateMacWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a client key.</p>
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
     * <b>description</b> :
     * <p>For information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a client key.</p>
     * 
     * @param request GetClientKeyRequest
     * @return GetClientKeyResponse
     */
    public GetClientKeyResponse getClientKey(GetClientKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This API is for users who migrate from KMS 1.0 to KMS 3.0. After the migration is complete, if you create an Asset without specifying a KMS instance, the Asset is created in the default KMS instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the default KMS instance in a specified region.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This API is for users who migrate from KMS 1.0 to KMS 3.0. After the migration is complete, if you create an Asset without specifying a KMS instance, the Asset is created in the default KMS instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the default KMS instance in a specified region.</p>
     * @return GetDefaultKmsInstanceResponse
     */
    public GetDefaultKmsInstanceResponse getDefaultKmsInstance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultKmsInstanceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Because the key policy name can only be set to default, you must set the PolicyName parameter to default when you query the key policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the key policy of a CMK in a KMS instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Because the key policy name can only be set to default, you must set the PolicyName parameter to default when you query the key policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the key policy of a CMK in a KMS instance.</p>
     * 
     * @param request GetKeyPolicyRequest
     * @return GetKeyPolicyResponse
     */
    public GetKeyPolicyResponse getKeyPolicy(GetKeyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Refer to <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a> for the access policy required to call this OpenAPI as a RAM user or RAM role.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a KMS instance.</p>
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
     * <b>description</b> :
     * <p>Refer to <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a> for the access policy required to call this OpenAPI as a RAM user or RAM role.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a KMS instance.</p>
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
     * <p>Queries the quota usage and limits for a KMS instance.</p>
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
     * <p>Queries the quota usage and limits for a KMS instance.</p>
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
     * <p>For information about the access policy that must be granted to a RAM user or RAM role to call this operation, refer to access control.
     * This operation can be called through a shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the plaintext of a managed data key (DK).</p>
     * 
     * @param request GetManagedDataKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManagedDataKeyResponse
     */
    public GetManagedDataKeyResponse getManagedDataKeyWithOptions(GetManagedDataKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataKeyName)) {
            query.put("DataKeyName", request.dataKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataKeyVersionId)) {
            query.put("DataKeyVersionId", request.dataKeyVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useLatest)) {
            query.put("UseLatest", request.useLatest);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagedDataKey"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagedDataKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the access policy that must be granted to a RAM user or RAM role to call this operation, refer to access control.
     * This operation can be called through a shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the plaintext of a managed data key (DK).</p>
     * 
     * @param request GetManagedDataKeyRequest
     * @return GetManagedDataKeyResponse
     */
    public GetManagedDataKeyResponse getManagedDataKey(GetManagedDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagedDataKeyWithOptions(request, runtime);
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
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports both shared gateways and dedicated gateways. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. If you access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the public key of an asymmetric key. You can use the public key to encrypt data or verify a signature on your device.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports both shared gateways and dedicated gateways. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.<ul>
     * <li>Shared gateway: You can access KMS over the Internet or using a VPC domain name. If you access KMS over the Internet, you must enable Internet access. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * <li>Dedicated gateway: You can access KMS using the private endpoint of KMS (<code>&lt;YOUR_KMS_INSTANCE_ID&gt;.cryptoservice.kms.aliyuncs.com</code>).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the public key of an asymmetric key. You can use the public key to encrypt data or verify a signature on your device.</p>
     * 
     * @param request GetPublicKeyRequest
     * @return GetPublicKeyResponse
     */
    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a random password string.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a random password string.</p>
     * 
     * @param request GetRandomPasswordRequest
     * @return GetRandomPasswordResponse
     */
    public GetRandomPasswordResponse getRandomPassword(GetRandomPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRandomPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>A credential policy name can be set only to default. Therefore, you must set the PolicyName parameter to default when you query the credential policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the access policy of a specified secret in a KMS instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>A credential policy name can be set only to default. Therefore, you must set the PolicyName parameter to default when you query the credential policy. Otherwise, a <code>Not Found</code> error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the access policy of a specified secret in a KMS instance.</p>
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
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>If you do not specify a version number or version status, Key Management Service (KMS) returns the credential value of the version marked as ACSCurrent by default.</li>
     * <li>If a customer-managed key is used to protect the credential value, the caller must also have the <code>kms:Decrypt</code> permission on the corresponding master key.
     * This topic provides a sample request to retrieve the credential value of a credential named <code>secret001</code>. The returned result shows that the credential value <code>SecretData</code> is <code>testdata1</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the credential value.</p>
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
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>If you do not specify a version number or version status, Key Management Service (KMS) returns the credential value of the version marked as ACSCurrent by default.</li>
     * <li>If a customer-managed key is used to protect the credential value, the caller must also have the <code>kms:Decrypt</code> permission on the corresponding master key.
     * This topic provides a sample request to retrieve the credential value of a credential named <code>secret001</code>. The returned result shows that the credential value <code>SecretData</code> is <code>testdata1</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the credential value.</p>
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
     * <p>When you call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> to create a CMK, you can set <strong>Origin</strong> to <strong>EXTERNAL</strong> to specify that the key material comes from an external source. Use this operation to import the key material into such a CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, call <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> to obtain the parameters required for the import, including the public key and import token.<blockquote>
     * <ul>
     * <li><p>For a CMK of type <strong>Aliyun_AES_256</strong>, the key material must be 256 bits. For a CMK of type <strong>Aliyun_SM4</strong>, the key material must be 128 bits.</p>
     * </li>
     * <li><p>You can set the expiration time for the key material, or you can set it to never expire.</p>
     * </li>
     * <li><p>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</p>
     * </li>
     * <li><p>After the imported key material expires or is deleted, the specified CMK becomes unavailable until the same key material is imported again.</p>
     * </li>
     * <li><p>The same key material can be imported into multiple CMKs, but data or data keys encrypted by one CMK cannot be decrypted by another CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports externally generated key material into a CMK whose origin is EXTERNAL.</p>
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
     * <p>When you call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> to create a CMK, you can set <strong>Origin</strong> to <strong>EXTERNAL</strong> to specify that the key material comes from an external source. Use this operation to import the key material into such a CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, call <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> to obtain the parameters required for the import, including the public key and import token.<blockquote>
     * <ul>
     * <li><p>For a CMK of type <strong>Aliyun_AES_256</strong>, the key material must be 256 bits. For a CMK of type <strong>Aliyun_SM4</strong>, the key material must be 128 bits.</p>
     * </li>
     * <li><p>You can set the expiration time for the key material, or you can set it to never expire.</p>
     * </li>
     * <li><p>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</p>
     * </li>
     * <li><p>After the imported key material expires or is deleted, the specified CMK becomes unavailable until the same key material is imported again.</p>
     * </li>
     * <li><p>The same key material can be imported into multiple CMKs, but data or data keys encrypted by one CMK cannot be decrypted by another CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports externally generated key material into a CMK whose origin is EXTERNAL.</p>
     * 
     * @param request ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     */
    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyMaterialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries all aliases that are bound to a key.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries all aliases that are bound to a key.</p>
     * 
     * @param request ListAliasesByKeyIdRequest
     * @return ListAliasesByKeyIdResponse
     */
    public ListAliasesByKeyIdResponse listAliasesByKeyId(ListAliasesByKeyIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesByKeyIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all application access points (AAPs) in the current region.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all application access points (AAPs) in the current region.</p>
     * 
     * @param request ListApplicationAccessPointsRequest
     * @return ListApplicationAccessPointsResponse
     */
    public ListApplicationAccessPointsResponse listApplicationAccessPoints(ListApplicationAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all client keys within an AAP.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all client keys within an AAP.</p>
     * 
     * @param request ListClientKeysRequest
     * @return ListClientKeysResponse
     */
    public ListClientKeysResponse listClientKeys(ListClientKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs and ARNs of all CMKs in the current region.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs and ARNs of all CMKs in the current region.</p>
     * 
     * @param request ListKeysRequest
     * @return ListKeysResponse
     */
    public ListKeysResponse listKeys(ListKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all KMS instances in the current region.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all KMS instances in the current region.</p>
     * 
     * @param request ListKmsInstancesRequest
     * @return ListKmsInstancesResponse
     */
    public ListKmsInstancesResponse listKmsInstances(ListKmsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKmsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through the shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the key versions of a specified managed data key (DK).</p>
     * 
     * @param request ListManagedDataKeyVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManagedDataKeyVersionsResponse
     */
    public ListManagedDataKeyVersionsResponse listManagedDataKeyVersionsWithOptions(ListManagedDataKeyVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataKeyName)) {
            query.put("DataKeyName", request.dataKeyName);
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
            new TeaPair("action", "ListManagedDataKeyVersions"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManagedDataKeyVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through the shared gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through public or VPC endpoints.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the key versions of a specified managed data key (DK).</p>
     * 
     * @param request ListManagedDataKeyVersionsRequest
     * @return ListManagedDataKeyVersionsResponse
     */
    public ListManagedDataKeyVersionsResponse listManagedDataKeyVersions(ListManagedDataKeyVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManagedDataKeyVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all network access rules in the current region.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all network access rules in the current region.</p>
     * 
     * @param request ListNetworkRulesRequest
     * @return ListNetworkRulesResponse
     */
    public ListNetworkRulesResponse listNetworkRules(ListNetworkRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all permission policies in the current region.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all permission policies in the current region.</p>
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
     * <b>summary</b> : 
     * <p>Queries the tags of a customer master key (CMK).</p>
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
     * <b>summary</b> : 
     * <p>Queries the tags of a customer master key (CMK).</p>
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
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>The version information does not include the secret value. By default, this operation returns only the secret versions that are marked with a version stage.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all version IDs and stage labels of a specified secret.</p>
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
     * <ul>
     * <li>For more information about the access policy required for a RAM user or RAM role to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>The version information does not include the secret value. By default, this operation returns only the secret versions that are marked with a version stage.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all version IDs and stage labels of a specified secret.</p>
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
     * <ul>
     * <li>To call this operation, the RAM user or RAM role must be granted the required policy. For more information, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation returns only secret metadata, not the secret values.
     * This example shows how to query secrets created by the current user in the current region. <code>PageNumber</code> is set to <code>1</code> and <code>PageSize</code> is set to <code>2</code>, returning metadata for two secrets.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all secrets in the current region.</p>
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
     * <ul>
     * <li>To call this operation, the RAM user or RAM role must be granted the required policy. For more information, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation returns only secret metadata, not the secret values.
     * This example shows how to query secrets created by the current user in the current region. <code>PageNumber</code> is set to <code>1</code> and <code>PageSize</code> is set to <code>2</code>, returning metadata for two secrets.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all secrets in the current region.</p>
     * 
     * @param request ListSecretsRequest
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the tags that are bound to a key or a secret.</p>
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
     * <b>description</b> :
     * <p>For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the tags that are bound to a key or a secret.</p>
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
     * <ul>
     * <li>For more information about the access policies that a RAM user or RAM role needs to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>KMS is a paid service. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52608.html">Billing</a>.</li>
     * <li>You can activate the service for an Alibaba Cloud account only once.</li>
     * <li>Make sure that your Alibaba Cloud account has completed real-name verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Key Management Service (KMS) for your Alibaba Cloud account.</p>
     * 
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
     * <ul>
     * <li>For more information about the access policies that a RAM user or RAM role needs to call this OpenAPI, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>KMS is a paid service. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52608.html">Billing</a>.</li>
     * <li>You can activate the service for an Alibaba Cloud account only once.</li>
     * <li>Make sure that your Alibaba Cloud account has completed real-name verification.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Key Management Service (KMS) for your Alibaba Cloud account.</p>
     * @return OpenKmsServiceResponse
     */
    public OpenKmsServiceResponse openKmsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openKmsServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports only generic secrets. Each generic secret can have a maximum of 10 versions. If the number of versions exceeds the limit, KMS deletes the earliest version.</li>
     * <li>By default, the new secret value is marked with ACSCurrent, and the previous version that was marked with ACSCurrent is marked with ACSPrevious. You can specify the VersionStage parameter to overwrite this default behavior.</li>
     * <li>This operation stores a new version of a secret value. You cannot use it to modify an existing version of a secret value. You must specify a version number when you store a new version. KMS processes requests based on the following rules:<ul>
     * <li>If the version number does not exist in the secret, KMS creates a new version and stores the secret value.</li>
     * <li>If the version number already exists in the secret, KMS compares the secret value in the request with the stored value. If the values are the same, the request is ignored and a success message is returned. This makes the operation idempotent. If the values are different, the request is rejected.
     * This topic provides an example of how to store a new version of a secret value for the secret named <code>secret001</code>. The new version number (<code>VersionId</code>) is <code>v3</code> and the secret value (<code>SecretData</code>) is <code>importantdata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stores a new version of a secret value for a generic secret.</p>
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
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports only generic secrets. Each generic secret can have a maximum of 10 versions. If the number of versions exceeds the limit, KMS deletes the earliest version.</li>
     * <li>By default, the new secret value is marked with ACSCurrent, and the previous version that was marked with ACSCurrent is marked with ACSPrevious. You can specify the VersionStage parameter to overwrite this default behavior.</li>
     * <li>This operation stores a new version of a secret value. You cannot use it to modify an existing version of a secret value. You must specify a version number when you store a new version. KMS processes requests based on the following rules:<ul>
     * <li>If the version number does not exist in the secret, KMS creates a new version and stores the secret value.</li>
     * <li>If the version number already exists in the secret, KMS compares the secret value in the request with the stored value. If the values are the same, the request is ignored and a success message is returned. This makes the operation idempotent. If the values are different, the request is rejected.
     * This topic provides an example of how to store a new version of a secret value for the secret named <code>secret001</code>. The new version number (<code>VersionId</code>) is <code>v3</code> and the secret value (<code>SecretData</code>) is <code>importantdata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stores a new version of a secret value for a generic secret.</p>
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
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required to grant a RAM user or RAM role the permission to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible only through a shared gateway, not a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.
     * When using a shared gateway, you access KMS through an Internet or a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>This operation is accessible only through a shared gateway. The single-user queries per second (QPS) limit is 750. If this limit is exceeded, requests are throttled, which may affect your business. We recommend that you stay within the specified limit.</p>
     * <h3>Details</h3>
     * <p>You can use the ReEncrypt operation in the following scenarios:</p>
     * <ul>
     * <li>After a customer master key (CMK) is rotated, you can use the latest key version to re-encrypt data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Automatic key rotation</a>.</li>
     * <li>You can re-encrypt data by changing the encryption context without changing the master key.</li>
     * <li>You can re-encrypt data or a data key that is encrypted by one master key with another master key in KMS.
     * The ReEncrypt operation requires the following permissions:</li>
     * <li>The kms:ReEncryptFrom permission for the source master key.</li>
     * <li>The kms:ReEncryptTo permission for the destination master key.</li>
     * <li>You can use kms:ReEncrypt\* to grant both permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-encrypts ciphertext under a different CMK without exposing the plaintext.</p>
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
     * <h3>Notes</h3>
     * <ul>
     * <li>For more information about the access policy required to grant a RAM user or RAM role the permission to use this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation is accessible only through a shared gateway, not a dedicated gateway. For more information, see <a href="https://help.aliyun.com/document_detail/601559.html">Alibaba Cloud SDK</a>.
     * When using a shared gateway, you access KMS through an Internet or a VPC domain name. This method requires Internet access to be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2856718.html">Access keys in a KMS instance over the Internet</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>This operation is accessible only through a shared gateway. The single-user queries per second (QPS) limit is 750. If this limit is exceeded, requests are throttled, which may affect your business. We recommend that you stay within the specified limit.</p>
     * <h3>Details</h3>
     * <p>You can use the ReEncrypt operation in the following scenarios:</p>
     * <ul>
     * <li>After a customer master key (CMK) is rotated, you can use the latest key version to re-encrypt data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Automatic key rotation</a>.</li>
     * <li>You can re-encrypt data by changing the encryption context without changing the master key.</li>
     * <li>You can re-encrypt data or a data key that is encrypted by one master key with another master key in KMS.
     * The ReEncrypt operation requires the following permissions:</li>
     * <li>The kms:ReEncryptFrom permission for the source master key.</li>
     * <li>The kms:ReEncryptTo permission for the destination master key.</li>
     * <li>You can use kms:ReEncrypt\* to grant both permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-encrypts ciphertext under a different CMK without exposing the plaintext.</p>
     * 
     * @param request ReEncryptRequest
     * @return ReEncryptResponse
     */
    public ReEncryptResponse reEncrypt(ReEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reEncryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to allow a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Subscription instances cannot be manually released. You can only unsubscribe from them under specific conditions. To unsubscribe, go to the Expenses and Costs page in the console and choose Unsubscribe. For more information, see <a href="https://help.aliyun.com/document_detail/600418.html">Unsubscription policy</a>.</li>
     * <li>After you release an instance, all resources in the instance are also released. Resources that are encrypted using keys in the instance cannot be decrypted, and credentials cannot be retrieved. Before you release an instance, make sure that no data is encrypted by the keys in the instance and no services call the credentials. This prevents service interruptions.</li>
     * <li>If your instance is a software key management instance, we recommend that you back up the resources of the instance before you release it. The backed-up resources can be recovered. For more information, see <a href="https://help.aliyun.com/document_detail/2357488.html">Backup management</a>.</li>
     * <li>The billing epoch is daily. Therefore, after you release a pay-as-you-go instance, the bill for the previous day is pushed before 12:00 on the next day.</li>
     * <li>Before you release a KMS instance, we recommend that you check whether deletion protection is enabled for the instance in the console. If deletion protection is enabled, disable it in the console before you release the instance. For more information, see <a href="https://help.aliyun.com/document_detail/604735.html">Manage a KMS instance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go KMS instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that is required to allow a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>Subscription instances cannot be manually released. You can only unsubscribe from them under specific conditions. To unsubscribe, go to the Expenses and Costs page in the console and choose Unsubscribe. For more information, see <a href="https://help.aliyun.com/document_detail/600418.html">Unsubscription policy</a>.</li>
     * <li>After you release an instance, all resources in the instance are also released. Resources that are encrypted using keys in the instance cannot be decrypted, and credentials cannot be retrieved. Before you release an instance, make sure that no data is encrypted by the keys in the instance and no services call the credentials. This prevents service interruptions.</li>
     * <li>If your instance is a software key management instance, we recommend that you back up the resources of the instance before you release it. The backed-up resources can be recovered. For more information, see <a href="https://help.aliyun.com/document_detail/2357488.html">Backup management</a>.</li>
     * <li>The billing epoch is daily. Therefore, after you release a pay-as-you-go instance, the bill for the previous day is pushed before 12:00 on the next day.</li>
     * <li>Before you release a KMS instance, we recommend that you check whether deletion protection is enabled for the instance in the console. If deletion protection is enabled, disable it in the console before you release the instance. For more information, see <a href="https://help.aliyun.com/document_detail/604735.html">Manage a KMS instance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go KMS instance.</p>
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
     * <b>summary</b> : 
     * <p>Restores a deleted secret.</p>
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
     * <b>summary</b> : 
     * <p>Restores a deleted secret.</p>
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
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Immediately rotates a secret.</p>
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
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Immediately rotates a secret.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a specified customer master key (CMK).</p>
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
     * <b>summary</b> : 
     * <p>Deletes a specified customer master key (CMK).</p>
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
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>After you enable deletion protection for a CMK, you cannot delete the CMK. To delete the CMK, disable deletion protection first.  </li>
     * <li>Before you invoke the SetDeletionProtection operation, make sure that the CMK is not in the PendingDeletion state. You can invoke the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status (KeyState) of the CMK.</li>
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

        if (!com.aliyun.teautil.Common.isUnset(request.kmsInstanceId)) {
            query.put("KmsInstanceId", request.kmsInstanceId);
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
     * <ul>
     * <li>For details about the access policy that must be granted to a Resource Access Management (RAM) user or RAM role to invoke this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>After you enable deletion protection for a CMK, you cannot delete the CMK. To delete the CMK, disable deletion protection first.  </li>
     * <li>Before you invoke the SetDeletionProtection operation, make sure that the CMK is not in the PendingDeletion state. You can invoke the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status (KeyState) of the CMK.</li>
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about key policies, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the key policy for a CMK in a KMS instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy required for a RAM user or RAM role to call this API operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about key policies, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the key policy for a CMK in a KMS instance.</p>
     * 
     * @param request SetKeyPolicyRequest
     * @return SetKeyPolicyResponse
     */
    public SetKeyPolicyResponse setKeyPolicy(SetKeyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setKeyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about secret policies, see <a href="https://help.aliyun.com/document_detail/2716465.html">Secret policy overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the access policy for a secret in a KMS instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>For information about the access policy that a RAM user or RAM role requires to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>For more information about secret policies, see <a href="https://help.aliyun.com/document_detail/2716465.html">Secret policy overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the access policy for a secret in a KMS instance.</p>
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
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to a CMK, secret, or certificate.</p>
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
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to a CMK, secret, or certificate.</p>
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
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to one or more keys or secrets.</p>
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
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to one or more keys or secrets.</p>
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
     * <p>For information about the access policy that is required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.
     * This topic provides an example of how to detach tags with the tag keys tagkey1 and tagkey2 from the key with the ID <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from a CMK, secret, or certificate.</p>
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
     * <p>For information about the access policy that is required for a RAM user or RAM role to call this OpenAPI operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.
     * This topic provides an example of how to detach tags with the tag keys tagkey1 and tagkey2 from the key with the ID <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from a CMK, secret, or certificate.</p>
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
     * <b>summary</b> : 
     * <p>Binds an existing alias to a different customer master key (CMK) ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds an existing alias to a different customer master key (CMK) ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the information about an application access point (AAP).</p>
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
     * <b>summary</b> : 
     * <p>Updates the information about an application access point (AAP).</p>
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
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. Use this operation to add, modify, or delete the description of a CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a CMK.</p>
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
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. Use this operation to add, modify, or delete the description of a CMK.
     * For more information about the access policy required for a RAM user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a CMK.</p>
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
     * <ul>
     * <li>For information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>If your self-managed application is deployed in multiple VPCs in the same region, you can bind the KMS instance to additional VPCs. These VPCs are in addition to the one that you specified when you enabled the instance.
     * These VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in these VPCs can access the specified KMS instance.<blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitch resources from those accounts with the Alibaba Cloud account that owns the KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the VPC bindings of a KMS instance.</p>
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
     * <ul>
     * <li>For information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>If your self-managed application is deployed in multiple VPCs in the same region, you can bind the KMS instance to additional VPCs. These VPCs are in addition to the one that you specified when you enabled the instance.
     * These VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in these VPCs can access the specified KMS instance.<blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitch resources from those accounts with the Alibaba Cloud account that owns the KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the VPC bindings of a KMS instance.</p>
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
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>You can only modify the private IP addresses and description of a network control rule. The name and network type cannot be modified.</li>
     * <li>When you update a network control rule, the access policies attached to it are also updated. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a network access rule.</p>
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
     * <li>For more information about the access policy required for a Resource Access Management (RAM) user or RAM role to call this operation, see <a href="https://help.aliyun.com/document_detail/2767210.html">Access control</a>.</li>
     * <li>You can only modify the private IP addresses and description of a network control rule. The name and network type cannot be modified.</li>
     * <li>When you update a network control rule, the access policies attached to it are also updated. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a network access rule.</p>
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
     * <p>Updates a permission policy.</p>
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
     * <p>Updates a permission policy.</p>
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
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the automatic rotation policy of a CMK.</p>
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
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.
     * For more information about the access policy required by a RAM user or RAM role to call this API, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the automatic rotation policy of a CMK.</p>
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
     * <b>summary</b> : 
     * <p>Updates the rotation policy of a secret.</p>
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
     * <b>summary</b> : 
     * <p>Updates the rotation policy of a secret.</p>
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
     * <ul>
     * <li>For more information about the access policy that is required to call this operation as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports only generic secrets. You can perform the following operations:<ul>
     * <li>Add a version stage to a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version and attach it to another secret version.</li>
     * </ul>
     * </li>
     * <li>The total number of version stages for each generic secret cannot exceed 8.
     * This topic provides an example of how to update the version stage of the secret named <code>secret001</code>. In this example, the <code>ACSCurrent</code> stage is used to mark version <code>002</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a version stage label to a different version of a secret.</p>
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
     * <ul>
     * <li>For more information about the access policy that is required to call this operation as a Resource Access Management (RAM) user or RAM role, see <a href="https://help.aliyun.com/document_detail/2767210.html">Resource Access Management</a>.</li>
     * <li>This operation supports only generic secrets. You can perform the following operations:<ul>
     * <li>Add a version stage to a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version.</li>
     * <li>Remove a version stage from a specified secret version and attach it to another secret version.</li>
     * </ul>
     * </li>
     * <li>The total number of version stages for each generic secret cannot exceed 8.
     * This topic provides an example of how to update the version stage of the secret named <code>secret001</code>. In this example, the <code>ACSCurrent</code> stage is used to mark version <code>002</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a version stage label to a different version of a secret.</p>
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
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the HMAC message authentication code of a specific message by using a specified key.</p>
     * 
     * @param request VerifyMacRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyMacResponse
     */
    public VerifyMacResponse verifyMacWithOptions(VerifyMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyMac"),
            new TeaPair("version", "2016-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyMacResponse());
    }

    /**
     * <b>description</b> :
     * <p>For details about the access policy required when a RAM user or RAM role invokes this operation, refer to access control.
     * This operation can be invoked through a shared gateway or a dedicated gateway. For more information, refer to Alibaba Cloud SDK.</p>
     * <ul>
     * <li>Shared gateway: Access KMS through a public or VPC endpoint. This method requires you to enable the public network access switch. For more information, refer to accessing keys in a KMS instance over the Internet.</li>
     * <li>Dedicated gateway: Access KMS through a KMS private endpoint (<YOUR_KMS_INSTANCE_ID>.cryptoservice.kms.aliyuncs.com).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the HMAC message authentication code of a specific message by using a specified key.</p>
     * 
     * @param request VerifyMacRequest
     * @return VerifyMacResponse
     */
    public VerifyMacResponse verifyMac(VerifyMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMacWithOptions(request, runtime);
    }
}
