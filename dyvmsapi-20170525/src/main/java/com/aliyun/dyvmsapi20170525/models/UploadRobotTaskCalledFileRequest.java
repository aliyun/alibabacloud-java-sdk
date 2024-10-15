// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileRequest extends TeaModel {
    /**
     * <p>The called numbers. Separate multiple called numbers with commas (,).</p>
     * <blockquote>
     * <p>After you create a robocall task, you must upload called numbers in batches. You can upload up to 300,000 called numbers for each task.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1370<strong><strong>000,1370</strong></strong>111</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The unique ID of the robocall task. You can call the <a href="~~CreateRobotTask~~">CreateRobotTask</a> operation to obtain the ID of the robocall task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1045****</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The values of the variable in the text-to-speech (TTS) template, in the JSON format. The variable values specified by the TtsParam parameter must match the variable names specified by the TtsParamHead parameter.</p>
     * <ul>
     * <li>If all the called numbers carry the same variable values, you can set the value of the number field to <strong>all</strong> and upload only one copy of the variable values.</li>
     * <li>If only some of the called numbers carry the same variable values, you can set the value of the number field to <strong>all</strong> for these called numbers and set the value of the number field and variable values for other called numbers based on your business requirements. The system preferentially selects the values that you set for the called numbers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;number&quot;:&quot;1370****000&quot;,&quot;params&quot;:[&quot;xiaowang&quot;,&quot;xiaoli&quot;,&quot;xiaozhou&quot;]}]</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>The list of variable names carried in the robocall task, in the JSON format. The TtsParamHead parameter must be used together with the TtsParam parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;name1&quot;,&quot;name2&quot;,&quot;name3&quot;]</p>
     */
    @NameInMap("TtsParamHead")
    public String ttsParamHead;

    public static UploadRobotTaskCalledFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRobotTaskCalledFileRequest self = new UploadRobotTaskCalledFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadRobotTaskCalledFileRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public UploadRobotTaskCalledFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UploadRobotTaskCalledFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadRobotTaskCalledFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UploadRobotTaskCalledFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UploadRobotTaskCalledFileRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public UploadRobotTaskCalledFileRequest setTtsParamHead(String ttsParamHead) {
        this.ttsParamHead = ttsParamHead;
        return this;
    }
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

}
