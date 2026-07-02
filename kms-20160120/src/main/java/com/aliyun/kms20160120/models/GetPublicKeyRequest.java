// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the DryRun mode.</p>
     * <ul>
     * <li><p>true: enables the DryRun mode.</p>
     * </li>
     * <li><p>false (default): disables the DryRun mode.</p>
     * </li>
     * </ul>
     * <p>The DryRun mode is used to test API calls, verify your permissions on resources, and check whether the parameters are valid. If you enable the DryRun mode, KMS always returns a failed response and a failure reason. The failure reasons include the following:</p>
     * <ul>
     * <li><p>DryRunOperationError: The request would have succeeded if the DryRun parameter is not specified.</p>
     * </li>
     * <li><p>ValidationError: The specified parameters in the request are invalid.</p>
     * </li>
     * <li><p>AccessDeniedError: You are not authorized to perform the operation on the KMS resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The globally unique identifier of the customer master key (CMK). This parameter can also be an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Use of aliases</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The globally unique identifier of the key version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    public static GetPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicKeyRequest self = new GetPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicKeyRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public GetPublicKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetPublicKeyRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

}
