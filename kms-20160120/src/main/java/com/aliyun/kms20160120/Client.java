// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120;

import com.aliyun.tea.*;
import com.aliyun.kms20160120.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AsymmetricDecryptResponse asymmetricDecryptWithOptions(AsymmetricDecryptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AsymmetricDecrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new AsymmetricDecryptResponse());
    }

    public AsymmetricDecryptResponse asymmetricDecrypt(AsymmetricDecryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asymmetricDecryptWithOptions(request, runtime);
    }

    public AsymmetricEncryptResponse asymmetricEncryptWithOptions(AsymmetricEncryptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AsymmetricEncrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new AsymmetricEncryptResponse());
    }

    public AsymmetricEncryptResponse asymmetricEncrypt(AsymmetricEncryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asymmetricEncryptWithOptions(request, runtime);
    }

    public AsymmetricSignResponse asymmetricSignWithOptions(AsymmetricSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AsymmetricSign", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new AsymmetricSignResponse());
    }

    public AsymmetricSignResponse asymmetricSign(AsymmetricSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asymmetricSignWithOptions(request, runtime);
    }

    public AsymmetricVerifyResponse asymmetricVerifyWithOptions(AsymmetricVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AsymmetricVerify", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new AsymmetricVerifyResponse());
    }

    public AsymmetricVerifyResponse asymmetricVerify(AsymmetricVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.asymmetricVerifyWithOptions(request, runtime);
    }

    public CancelKeyDeletionResponse cancelKeyDeletionWithOptions(CancelKeyDeletionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelKeyDeletion", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CancelKeyDeletionResponse());
    }

    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelKeyDeletionWithOptions(request, runtime);
    }

    public CertificatePrivateKeyDecryptResponse certificatePrivateKeyDecryptWithOptions(CertificatePrivateKeyDecryptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CertificatePrivateKeyDecrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CertificatePrivateKeyDecryptResponse());
    }

    public CertificatePrivateKeyDecryptResponse certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.certificatePrivateKeyDecryptWithOptions(request, runtime);
    }

    public CertificatePrivateKeySignResponse certificatePrivateKeySignWithOptions(CertificatePrivateKeySignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CertificatePrivateKeySign", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CertificatePrivateKeySignResponse());
    }

    public CertificatePrivateKeySignResponse certificatePrivateKeySign(CertificatePrivateKeySignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.certificatePrivateKeySignWithOptions(request, runtime);
    }

    public CertificatePublicKeyEncryptResponse certificatePublicKeyEncryptWithOptions(CertificatePublicKeyEncryptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CertificatePublicKeyEncrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CertificatePublicKeyEncryptResponse());
    }

    public CertificatePublicKeyEncryptResponse certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.certificatePublicKeyEncryptWithOptions(request, runtime);
    }

    public CertificatePublicKeyVerifyResponse certificatePublicKeyVerifyWithOptions(CertificatePublicKeyVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CertificatePublicKeyVerify", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CertificatePublicKeyVerifyResponse());
    }

    public CertificatePublicKeyVerifyResponse certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.certificatePublicKeyVerifyWithOptions(request, runtime);
    }

    public CreateAliasResponse createAliasWithOptions(CreateAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlias", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAliasResponse());
    }

    public CreateAliasResponse createAlias(CreateAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAliasWithOptions(request, runtime);
    }

    public CreateCertificateResponse createCertificateWithOptions(CreateCertificateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCertificateShrinkRequest request = new CreateCertificateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subjectAlternativeNames)) {
            request.subjectAlternativeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subjectAlternativeNames, "SubjectAlternativeNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCertificateResponse());
    }

    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCertificateWithOptions(request, runtime);
    }

    public CreateKeyResponse createKeyWithOptions(CreateKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateKeyResponse());
    }

    public CreateKeyResponse createKey(CreateKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyWithOptions(request, runtime);
    }

    public CreateKeyVersionResponse createKeyVersionWithOptions(CreateKeyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateKeyVersion", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateKeyVersionResponse());
    }

    public CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyVersionWithOptions(request, runtime);
    }

    public CreateSecretResponse createSecretWithOptions(CreateSecretRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecretShrinkRequest request = new CreateSecretShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendedConfig)) {
            request.extendedConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendedConfig, "ExtendedConfig", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSecret", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSecretResponse());
    }

    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecretWithOptions(request, runtime);
    }

    public DecryptResponse decryptWithOptions(DecryptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DecryptShrinkRequest request = new DecryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Decrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DecryptResponse());
    }

    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decryptWithOptions(request, runtime);
    }

    public DeleteAliasResponse deleteAliasWithOptions(DeleteAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlias", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAliasResponse());
    }

    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAliasWithOptions(request, runtime);
    }

    public DeleteCertificateResponse deleteCertificateWithOptions(DeleteCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCertificateResponse());
    }

    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCertificateWithOptions(request, runtime);
    }

    public DeleteKeyMaterialResponse deleteKeyMaterialWithOptions(DeleteKeyMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteKeyMaterial", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteKeyMaterialResponse());
    }

    public DeleteKeyMaterialResponse deleteKeyMaterial(DeleteKeyMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKeyMaterialWithOptions(request, runtime);
    }

    public DeleteSecretResponse deleteSecretWithOptions(DeleteSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecret", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecretResponse());
    }

    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecretWithOptions(request, runtime);
    }

    public DescribeAccountKmsStatusResponse describeAccountKmsStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountKmsStatus", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountKmsStatusResponse());
    }

    public DescribeAccountKmsStatusResponse describeAccountKmsStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountKmsStatusWithOptions(runtime);
    }

    public DescribeCertificateResponse describeCertificateWithOptions(DescribeCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCertificateResponse());
    }

    public DescribeCertificateResponse describeCertificate(DescribeCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificateWithOptions(request, runtime);
    }

    public DescribeKeyResponse describeKeyWithOptions(DescribeKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeKeyResponse());
    }

    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyWithOptions(request, runtime);
    }

    public DescribeKeyVersionResponse describeKeyVersionWithOptions(DescribeKeyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeKeyVersion", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeKeyVersionResponse());
    }

    public DescribeKeyVersionResponse describeKeyVersion(DescribeKeyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyVersionWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    public DescribeSecretResponse describeSecretWithOptions(DescribeSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecret", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecretResponse());
    }

    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecretWithOptions(request, runtime);
    }

    public DescribeServiceResponse describeServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeService", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceResponse());
    }

    public DescribeServiceResponse describeService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceWithOptions(runtime);
    }

    public DisableKeyResponse disableKeyWithOptions(DisableKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableKeyResponse());
    }

    public DisableKeyResponse disableKey(DisableKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableKeyWithOptions(request, runtime);
    }

    public EnableKeyResponse enableKeyWithOptions(EnableKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableKeyResponse());
    }

    public EnableKeyResponse enableKey(EnableKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableKeyWithOptions(request, runtime);
    }

    public EncryptResponse encryptWithOptions(EncryptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EncryptShrinkRequest request = new EncryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Encrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new EncryptResponse());
    }

    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.encryptWithOptions(request, runtime);
    }

    public ExportCertificateResponse exportCertificateWithOptions(ExportCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ExportCertificateResponse());
    }

    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportCertificateWithOptions(request, runtime);
    }

    public ExportDataKeyResponse exportDataKeyWithOptions(ExportDataKeyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportDataKeyShrinkRequest request = new ExportDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportDataKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ExportDataKeyResponse());
    }

    public ExportDataKeyResponse exportDataKey(ExportDataKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportDataKeyWithOptions(request, runtime);
    }

    public GenerateAndExportDataKeyResponse generateAndExportDataKeyWithOptions(GenerateAndExportDataKeyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateAndExportDataKeyShrinkRequest request = new GenerateAndExportDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAndExportDataKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAndExportDataKeyResponse());
    }

    public GenerateAndExportDataKeyResponse generateAndExportDataKey(GenerateAndExportDataKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAndExportDataKeyWithOptions(request, runtime);
    }

    public GenerateDataKeyResponse generateDataKeyWithOptions(GenerateDataKeyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateDataKeyShrinkRequest request = new GenerateDataKeyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateDataKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateDataKeyResponse());
    }

    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDataKeyWithOptions(request, runtime);
    }

    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintextWithOptions(GenerateDataKeyWithoutPlaintextRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateDataKeyWithoutPlaintextShrinkRequest request = new GenerateDataKeyWithoutPlaintextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionContext)) {
            request.encryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionContext, "EncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateDataKeyWithoutPlaintext", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateDataKeyWithoutPlaintextResponse());
    }

    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDataKeyWithoutPlaintextWithOptions(request, runtime);
    }

    public GetCertificateResponse getCertificateWithOptions(GetCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetCertificateResponse());
    }

    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCertificateWithOptions(request, runtime);
    }

    public GetParametersForImportResponse getParametersForImportWithOptions(GetParametersForImportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetParametersForImport", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetParametersForImportResponse());
    }

    public GetParametersForImportResponse getParametersForImport(GetParametersForImportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getParametersForImportWithOptions(request, runtime);
    }

    public GetPublicKeyResponse getPublicKeyWithOptions(GetPublicKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPublicKey", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPublicKeyResponse());
    }

    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublicKeyWithOptions(request, runtime);
    }

    public GetRandomPasswordResponse getRandomPasswordWithOptions(GetRandomPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRandomPassword", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRandomPasswordResponse());
    }

    public GetRandomPasswordResponse getRandomPassword(GetRandomPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRandomPasswordWithOptions(request, runtime);
    }

    public GetSecretValueResponse getSecretValueWithOptions(GetSecretValueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSecretValue", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecretValueResponse());
    }

    public GetSecretValueResponse getSecretValue(GetSecretValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretValueWithOptions(request, runtime);
    }

    public ImportCertificateResponse importCertificateWithOptions(ImportCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ImportCertificateResponse());
    }

    public ImportCertificateResponse importCertificate(ImportCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importCertificateWithOptions(request, runtime);
    }

    public ImportEncryptionCertificateResponse importEncryptionCertificateWithOptions(ImportEncryptionCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportEncryptionCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ImportEncryptionCertificateResponse());
    }

    public ImportEncryptionCertificateResponse importEncryptionCertificate(ImportEncryptionCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importEncryptionCertificateWithOptions(request, runtime);
    }

    public ImportKeyMaterialResponse importKeyMaterialWithOptions(ImportKeyMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportKeyMaterial", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ImportKeyMaterialResponse());
    }

    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importKeyMaterialWithOptions(request, runtime);
    }

    public ListAliasesResponse listAliasesWithOptions(ListAliasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAliases", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAliasesResponse());
    }

    public ListAliasesResponse listAliases(ListAliasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAliasesWithOptions(request, runtime);
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyIdWithOptions(ListAliasesByKeyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAliasesByKeyId", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAliasesByKeyIdResponse());
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyId(ListAliasesByKeyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAliasesByKeyIdWithOptions(request, runtime);
    }

    public ListCertificatesResponse listCertificatesWithOptions(ListCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCertificates", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListCertificatesResponse());
    }

    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCertificatesWithOptions(request, runtime);
    }

    public ListKeysResponse listKeysWithOptions(ListKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListKeys", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListKeysResponse());
    }

    public ListKeysResponse listKeys(ListKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listKeysWithOptions(request, runtime);
    }

    public ListKeyVersionsResponse listKeyVersionsWithOptions(ListKeyVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListKeyVersions", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListKeyVersionsResponse());
    }

    public ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listKeyVersionsWithOptions(request, runtime);
    }

    public ListResourceTagsResponse listResourceTagsWithOptions(ListResourceTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceTags", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourceTagsResponse());
    }

    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceTagsWithOptions(request, runtime);
    }

    public ListSecretsResponse listSecretsWithOptions(ListSecretsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecrets", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecretsResponse());
    }

    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecretsWithOptions(request, runtime);
    }

    public ListSecretVersionIdsResponse listSecretVersionIdsWithOptions(ListSecretVersionIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecretVersionIds", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecretVersionIdsResponse());
    }

    public ListSecretVersionIdsResponse listSecretVersionIds(ListSecretVersionIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecretVersionIdsWithOptions(request, runtime);
    }

    public OpenKmsServiceResponse openKmsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenKmsService", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new OpenKmsServiceResponse());
    }

    public OpenKmsServiceResponse openKmsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openKmsServiceWithOptions(runtime);
    }

    public PutSecretValueResponse putSecretValueWithOptions(PutSecretValueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutSecretValue", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new PutSecretValueResponse());
    }

    public PutSecretValueResponse putSecretValue(PutSecretValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putSecretValueWithOptions(request, runtime);
    }

    public ReEncryptResponse reEncryptWithOptions(ReEncryptRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReEncryptShrinkRequest request = new ReEncryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceEncryptionContext)) {
            request.sourceEncryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceEncryptionContext, "SourceEncryptionContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationEncryptionContext)) {
            request.destinationEncryptionContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationEncryptionContext, "DestinationEncryptionContext", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReEncrypt", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReEncryptResponse());
    }

    public ReEncryptResponse reEncrypt(ReEncryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reEncryptWithOptions(request, runtime);
    }

    public RestoreSecretResponse restoreSecretWithOptions(RestoreSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreSecret", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreSecretResponse());
    }

    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreSecretWithOptions(request, runtime);
    }

    public RotateSecretResponse rotateSecretWithOptions(RotateSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RotateSecret", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new RotateSecretResponse());
    }

    public RotateSecretResponse rotateSecret(RotateSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rotateSecretWithOptions(request, runtime);
    }

    public ScheduleKeyDeletionResponse scheduleKeyDeletionWithOptions(ScheduleKeyDeletionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScheduleKeyDeletion", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ScheduleKeyDeletionResponse());
    }

    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scheduleKeyDeletionWithOptions(request, runtime);
    }

    public TagResourceResponse tagResourceWithOptions(TagResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResource", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourceResponse());
    }

    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourceWithOptions(request, runtime);
    }

    public UntagResourceResponse untagResourceWithOptions(UntagResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResource", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourceResponse());
    }

    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourceWithOptions(request, runtime);
    }

    public UpdateAliasResponse updateAliasWithOptions(UpdateAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAlias", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAliasResponse());
    }

    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAliasWithOptions(request, runtime);
    }

    public UpdateCertificateStatusResponse updateCertificateStatusWithOptions(UpdateCertificateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCertificateStatus", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCertificateStatusResponse());
    }

    public UpdateCertificateStatusResponse updateCertificateStatus(UpdateCertificateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCertificateStatusWithOptions(request, runtime);
    }

    public UpdateKeyDescriptionResponse updateKeyDescriptionWithOptions(UpdateKeyDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateKeyDescription", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateKeyDescriptionResponse());
    }

    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateKeyDescriptionWithOptions(request, runtime);
    }

    public UpdateRotationPolicyResponse updateRotationPolicyWithOptions(UpdateRotationPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRotationPolicy", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRotationPolicyResponse());
    }

    public UpdateRotationPolicyResponse updateRotationPolicy(UpdateRotationPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRotationPolicyWithOptions(request, runtime);
    }

    public UpdateSecretRotationPolicyResponse updateSecretRotationPolicyWithOptions(UpdateSecretRotationPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSecretRotationPolicy", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSecretRotationPolicyResponse());
    }

    public UpdateSecretRotationPolicyResponse updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecretRotationPolicyWithOptions(request, runtime);
    }

    public UpdateSecretVersionStageResponse updateSecretVersionStageWithOptions(UpdateSecretVersionStageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSecretVersionStage", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSecretVersionStageResponse());
    }

    public UpdateSecretVersionStageResponse updateSecretVersionStage(UpdateSecretVersionStageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecretVersionStageWithOptions(request, runtime);
    }

    public UploadCertificateResponse uploadCertificateWithOptions(UploadCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadCertificate", "2016-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UploadCertificateResponse());
    }

    public UploadCertificateResponse uploadCertificate(UploadCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadCertificateWithOptions(request, runtime);
    }
}
