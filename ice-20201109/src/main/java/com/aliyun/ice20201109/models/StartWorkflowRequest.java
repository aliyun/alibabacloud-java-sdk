// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartWorkflowRequest extends TeaModel {
    /**
     * <p>Specifies whether to skip the input path verification for the workflow. This parameter takes effect only when the workflow input is an OSS file. We recommend that you do not skip the verification to avoid errors caused by incorrect paths. If this parameter is not specified, the default value is false. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Skip the verification.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not skip the verification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipInputVerification")
    public Boolean skipInputVerification;

    /**
     * <p>The workflow input. Currently, media asset types and OSS files are supported.</p>
     * <p>Type: the supported media object type. Valid values:</p>
     * <ul>
     * <li><p>OSS: an OSS file.</p>
     * </li>
     * <li><p>Media: a media asset ID.</p>
     * </li>
     * </ul>
     * <p>Media: the media value. Valid values:</p>
     * <ul>
     * <li><p>If Type is set to OSS, the value is a URL that supports the OSS protocol and HTTP protocol.</p>
     * </li>
     * <li><p>If Type is set to Media, the value is a media asset ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Type&quot;: &quot;Media&quot;,
     *       &quot;Media&quot;: &quot;<strong><strong><strong>30706071edbfe290b488</strong></strong></strong>&quot;
     * } or
     * {
     *       &quot;Type&quot;: &quot;OSS&quot;,
     *       &quot;Media&quot;: &quot;oss://bucket.oss-ap-southeast-1.aliyuncs.com/A/B/C/test1.flv&quot;
     * }</p>
     */
    @NameInMap("TaskInput")
    public String taskInput;

    /**
     * <p>The custom settings in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow template ID. You can view the template ID in the <a href="https://ims.console.aliyun.com/settings/workflow/list">Intelligent Media Services console</a> by navigating to Configuration Management &gt; Workflow Template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>f0e54971ecbffd472190</strong></strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static StartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowRequest self = new StartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StartWorkflowRequest setSkipInputVerification(Boolean skipInputVerification) {
        this.skipInputVerification = skipInputVerification;
        return this;
    }
    public Boolean getSkipInputVerification() {
        return this.skipInputVerification;
    }

    public StartWorkflowRequest setTaskInput(String taskInput) {
        this.taskInput = taskInput;
        return this;
    }
    public String getTaskInput() {
        return this.taskInput;
    }

    public StartWorkflowRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public StartWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
