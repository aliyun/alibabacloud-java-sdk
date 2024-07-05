// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImportFpShotJobRequest extends TeaModel {
    /**
     * <p>The ID of the text fingerprint library to which the text file is imported. You can specify only one job of importing text files to a text fingerprint library at a time. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("FpDBId")
    public String fpDBId;

    /**
     * <p>The job configurations. The value must be a JSON object. Example: <code>{&quot;SaveType&quot;:&quot;onlysave&quot;}</code>. The <code>SaveType</code> field indicates the storage type. Valid values of the SaveType field:</p>
     * <ul>
     * <li><strong>save</strong>: The fingerprints of the text file are saved to the text fingerprint library only if the text file is not duplicated with content in the text fingerprint library.</li>
     * <li><strong>onlysave</strong>: The fingerprints of the text file are saved to the text fingerprint library.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SaveType&quot;:&quot;onlysave&quot;}</p>
     */
    @NameInMap("FpImportConfig")
    public String fpImportConfig;

    /**
     * <p>The Object Storage Service (OSS) URL of the text file to be imported to the text fingerprint library. The value must be a JSON object. Example: {&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.flv&quot;}.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{“Bucket”:”example-bucket”,“Location”:”oss-cn-shanghai”,“Object”:”example.txt”}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraVideo Media Processing (MPS) queue. To view the ID of the MPS queue, perform the following steps: Log on to the <strong>MPS console</strong>. In the left-side navigation pane, choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong>. The MPS queue is associated with a specified Message Service (MNS) topic. You can submit jobs for different services to different MPS queues. If you do not specify this parameter, the job is submitted to the default MPS queue and no MNS topic is associated with the MPS queue.</p>
     * 
     * <strong>example:</strong>
     * <p>ae687c02fe944327ba9631e50da2****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The user-defined data. The value can contain letters, digits, and special characters. The value can be up to 128 bytes in length.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ImportFpShotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportFpShotJobRequest self = new ImportFpShotJobRequest();
        return TeaModel.build(map, self);
    }

    public ImportFpShotJobRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public ImportFpShotJobRequest setFpImportConfig(String fpImportConfig) {
        this.fpImportConfig = fpImportConfig;
        return this;
    }
    public String getFpImportConfig() {
        return this.fpImportConfig;
    }

    public ImportFpShotJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ImportFpShotJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ImportFpShotJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportFpShotJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ImportFpShotJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportFpShotJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportFpShotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
