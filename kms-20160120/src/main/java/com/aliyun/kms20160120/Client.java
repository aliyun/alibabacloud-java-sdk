// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120;

import com.aliyun.tea.*;
import com.aliyun.kms20160120.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListSecretsResponse listSecretsEx(ListSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSecrets", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListSecretsResponse());
    }

    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretsEx(request, runtime);
    }

    public ListSecretVersionIdsResponse listSecretVersionIdsEx(ListSecretVersionIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSecretVersionIds", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListSecretVersionIdsResponse());
    }

    public ListSecretVersionIdsResponse listSecretVersionIds(ListSecretVersionIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretVersionIdsEx(request, runtime);
    }

    public DescribeSecretResponse describeSecretEx(DescribeSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecret", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DescribeSecretResponse());
    }

    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecretEx(request, runtime);
    }

    public UpdateSecretResponse updateSecretEx(UpdateSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSecret", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UpdateSecretResponse());
    }

    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretEx(request, runtime);
    }

    public GetSecretValueResponse getSecretValueEx(GetSecretValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSecretValue", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GetSecretValueResponse());
    }

    public GetSecretValueResponse getSecretValue(GetSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretValueEx(request, runtime);
    }

    public GetRandomPasswordResponse getRandomPasswordEx(GetRandomPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRandomPassword", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GetRandomPasswordResponse());
    }

    public GetRandomPasswordResponse getRandomPassword(GetRandomPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRandomPasswordEx(request, runtime);
    }

    public RestoreSecretResponse restoreSecretEx(RestoreSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestoreSecret", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new RestoreSecretResponse());
    }

    public RestoreSecretResponse restoreSecret(RestoreSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreSecretEx(request, runtime);
    }

    public CreateSecretResponse createSecretEx(CreateSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSecret", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new CreateSecretResponse());
    }

    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretEx(request, runtime);
    }

    public PutSecretValueResponse putSecretValueEx(PutSecretValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutSecretValue", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new PutSecretValueResponse());
    }

    public PutSecretValueResponse putSecretValue(PutSecretValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putSecretValueEx(request, runtime);
    }

    public DeleteSecretResponse deleteSecretEx(DeleteSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSecret", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DeleteSecretResponse());
    }

    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretEx(request, runtime);
    }

    public UpdateSecretVersionStageResponse updateSecretVersionStageEx(UpdateSecretVersionStageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSecretVersionStage", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UpdateSecretVersionStageResponse());
    }

    public UpdateSecretVersionStageResponse updateSecretVersionStage(UpdateSecretVersionStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretVersionStageEx(request, runtime);
    }

    public AsymmetricDecryptResponse asymmetricDecryptEx(AsymmetricDecryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AsymmetricDecrypt", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new AsymmetricDecryptResponse());
    }

    public AsymmetricDecryptResponse asymmetricDecrypt(AsymmetricDecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricDecryptEx(request, runtime);
    }

    public AsymmetricVerifyResponse asymmetricVerifyEx(AsymmetricVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AsymmetricVerify", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new AsymmetricVerifyResponse());
    }

    public AsymmetricVerifyResponse asymmetricVerify(AsymmetricVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricVerifyEx(request, runtime);
    }

    public AsymmetricSignResponse asymmetricSignEx(AsymmetricSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AsymmetricSign", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new AsymmetricSignResponse());
    }

    public AsymmetricSignResponse asymmetricSign(AsymmetricSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricSignEx(request, runtime);
    }

    public AsymmetricEncryptResponse asymmetricEncryptEx(AsymmetricEncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AsymmetricEncrypt", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new AsymmetricEncryptResponse());
    }

    public AsymmetricEncryptResponse asymmetricEncrypt(AsymmetricEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asymmetricEncryptEx(request, runtime);
    }

    public GetPublicKeyResponse getPublicKeyEx(GetPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPublicKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GetPublicKeyResponse());
    }

    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPublicKeyEx(request, runtime);
    }

    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintextEx(GenerateDataKeyWithoutPlaintextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateDataKeyWithoutPlaintext", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GenerateDataKeyWithoutPlaintextResponse());
    }

    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyWithoutPlaintextEx(request, runtime);
    }

    public UpdateKeyDescriptionResponse updateKeyDescriptionEx(UpdateKeyDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateKeyDescription", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UpdateKeyDescriptionResponse());
    }

    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKeyDescriptionEx(request, runtime);
    }

    public DescribeKeyVersionResponse describeKeyVersionEx(DescribeKeyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeKeyVersion", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DescribeKeyVersionResponse());
    }

    public DescribeKeyVersionResponse describeKeyVersion(DescribeKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyVersionEx(request, runtime);
    }

    public UpdateRotationPolicyResponse updateRotationPolicyEx(UpdateRotationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRotationPolicy", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UpdateRotationPolicyResponse());
    }

    public UpdateRotationPolicyResponse updateRotationPolicy(UpdateRotationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRotationPolicyEx(request, runtime);
    }

    public ListKeyVersionsResponse listKeyVersionsEx(ListKeyVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListKeyVersions", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListKeyVersionsResponse());
    }

    public ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeyVersionsEx(request, runtime);
    }

    public CreateKeyVersionResponse createKeyVersionEx(CreateKeyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateKeyVersion", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new CreateKeyVersionResponse());
    }

    public CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyVersionEx(request, runtime);
    }

    public DescribeServiceResponse describeServiceEx(DescribeServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeService", "HTTPS", "POST", "2016-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeServiceResponse());
    }

    public DescribeServiceResponse describeService(DescribeServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceEx(request, runtime);
    }

    public UpdateAliasResponse updateAliasEx(UpdateAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAlias", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UpdateAliasResponse());
    }

    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAliasEx(request, runtime);
    }

    public UntagResourceResponse untagResourceEx(UntagResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResource", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new UntagResourceResponse());
    }

    public UntagResourceResponse untagResource(UntagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourceEx(request, runtime);
    }

    public TagResourceResponse tagResourceEx(TagResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResource", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new TagResourceResponse());
    }

    public TagResourceResponse tagResource(TagResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourceEx(request, runtime);
    }

    public ScheduleKeyDeletionResponse scheduleKeyDeletionEx(ScheduleKeyDeletionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ScheduleKeyDeletion", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ScheduleKeyDeletionResponse());
    }

    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scheduleKeyDeletionEx(request, runtime);
    }

    public ListResourceTagsResponse listResourceTagsEx(ListResourceTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceTags", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListResourceTagsResponse());
    }

    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTagsEx(request, runtime);
    }

    public ListKeysResponse listKeysEx(ListKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListKeys", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListKeysResponse());
    }

    public ListKeysResponse listKeys(ListKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeysEx(request, runtime);
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyIdEx(ListAliasesByKeyIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAliasesByKeyId", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListAliasesByKeyIdResponse());
    }

    public ListAliasesByKeyIdResponse listAliasesByKeyId(ListAliasesByKeyIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesByKeyIdEx(request, runtime);
    }

    public ListAliasesResponse listAliasesEx(ListAliasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAliases", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListAliasesResponse());
    }

    public ListAliasesResponse listAliases(ListAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAliasesEx(request, runtime);
    }

    public ImportKeyMaterialResponse importKeyMaterialEx(ImportKeyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportKeyMaterial", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ImportKeyMaterialResponse());
    }

    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyMaterialEx(request, runtime);
    }

    public GetParametersForImportResponse getParametersForImportEx(GetParametersForImportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetParametersForImport", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GetParametersForImportResponse());
    }

    public GetParametersForImportResponse getParametersForImport(GetParametersForImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParametersForImportEx(request, runtime);
    }

    public GenerateDataKeyResponse generateDataKeyEx(GenerateDataKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateDataKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new GenerateDataKeyResponse());
    }

    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDataKeyEx(request, runtime);
    }

    public EncryptResponse encryptEx(EncryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("Encrypt", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new EncryptResponse());
    }

    public EncryptResponse encrypt(EncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptEx(request, runtime);
    }

    public EnableKeyResponse enableKeyEx(EnableKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new EnableKeyResponse());
    }

    public EnableKeyResponse enableKey(EnableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableKeyEx(request, runtime);
    }

    public DisableKeyResponse disableKeyEx(DisableKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DisableKeyResponse());
    }

    public DisableKeyResponse disableKey(DisableKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableKeyEx(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsEx(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2016-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsEx(request, runtime);
    }

    public DescribeKeyResponse describeKeyEx(DescribeKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DescribeKeyResponse());
    }

    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyEx(request, runtime);
    }

    public DeleteKeyMaterialResponse deleteKeyMaterialEx(DeleteKeyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteKeyMaterial", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DeleteKeyMaterialResponse());
    }

    public DeleteKeyMaterialResponse deleteKeyMaterial(DeleteKeyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyMaterialEx(request, runtime);
    }

    public DeleteAliasResponse deleteAliasEx(DeleteAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAlias", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DeleteAliasResponse());
    }

    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAliasEx(request, runtime);
    }

    public DecryptResponse decryptEx(DecryptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("Decrypt", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new DecryptResponse());
    }

    public DecryptResponse decrypt(DecryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decryptEx(request, runtime);
    }

    public CreateKeyResponse createKeyEx(CreateKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateKey", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new CreateKeyResponse());
    }

    public CreateKeyResponse createKey(CreateKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyEx(request, runtime);
    }

    public CreateAliasResponse createAliasEx(CreateAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAlias", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new CreateAliasResponse());
    }

    public CreateAliasResponse createAlias(CreateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAliasEx(request, runtime);
    }

    public CancelKeyDeletionResponse cancelKeyDeletionEx(CancelKeyDeletionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelKeyDeletion", "HTTPS", "POST", "2016-01-20", "AK", TeaModel.buildMap(request), null, runtime), new CancelKeyDeletionResponse());
    }

    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelKeyDeletionEx(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
