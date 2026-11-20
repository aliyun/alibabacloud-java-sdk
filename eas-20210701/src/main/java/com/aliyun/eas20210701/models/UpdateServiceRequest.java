// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request.</p>
     * <ul>
     * <li><p>true: sends a precheck request without performing the actual operation. If the precheck fails, the corresponding error is returned. If the precheck succeeds, the error code DryRunOperation is returned.</p>
     * </li>
     * <li><p>false: sends a normal request. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The type of the child service to update. Note: This parameter takes effect only for aggregated services.</p>
     * 
     * <strong>example:</strong>
     * <p>LLMPrefill</p>
     */
    @NameInMap("MemberToUpdate")
    public String memberToUpdate;

    /**
     * <p>The update type of the service. Both merge and replace modes are supported. If this parameter is not specified, the merge mode is used by default.</p>
     * <ul>
     * <li>merge: the merge mode. If the original service configuration JSON is
     * <code>{&quot;a&quot;:&quot;b&quot;}</code> and the updated configuration is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the final configuration in merge mode is <code>{&quot;a&quot;:&quot;b&quot;,&quot;c&quot;:&quot;d&quot;}</code>.</li>
     * <li>replace: the replace mode. If the original service configuration JSON is
     * <code>{&quot;a&quot;:&quot;b&quot;}</code> and the updated configuration is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the final configuration in replace mode is <code>{&quot;c&quot;:&quot;d&quot;}</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>merge</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    /**
     * <p>The updated configuration. For more information about parameter settings, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;name&quot;: &quot;foo&quot;,
     *       &quot;model_path&quot;: &quot;<a href="http://path/to/model.tar.gz">http://path/to/model.tar.gz</a>&quot;,
     *       &quot;processor&quot;: &quot;tensorflow_cpu&quot;,
     *       &quot;metadata&quot;: {
     *             &quot;instance&quot;: 2,
     *             &quot;memory&quot;: 7000,
     *             &quot;cpu&quot;: 4
     *       }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServiceRequest setMemberToUpdate(String memberToUpdate) {
        this.memberToUpdate = memberToUpdate;
        return this;
    }
    public String getMemberToUpdate() {
        return this.memberToUpdate;
    }

    public UpdateServiceRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateServiceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
