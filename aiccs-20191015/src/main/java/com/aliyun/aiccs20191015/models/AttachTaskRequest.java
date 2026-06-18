// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AttachTaskRequest extends TeaModel {
    /**
     * <p>The calling string (callee information and parameter list). Valid values:</p>
     * <ul>
     * <li><strong>LIST</strong>: Use this type when the script has no input variables. In this case, only the callee numbers need to be provided. Example: <code>0571****5678,0571****5679</code>.</li>
     * <li><strong>JSON</strong>: Use this type when the script includes input variables. You must provide the variable names, callee numbers, and variable values. Example: <code>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;181****0000&quot;,&quot;Params&quot;:[&quot;Zhang San&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;181****0001&quot;,&quot;Params&quot;:[&quot;Li Si&quot;,&quot;21&quot;]}]}</code>. <strong>ParamNames</strong> represents the list of parameter names; <strong>Params</strong> represents the list of parameter values.</li>
     * </ul>
     * <blockquote>
     * <p>You can view the script input variables on the <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script Management</strong></a> &gt; <strong>View</strong> &gt; <strong>Input and Output Parameters</strong> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ParamNames&quot;: [
     *     &quot;name&quot;,
     *     &quot;age&quot;
     *   ],
     *   &quot;CalleeList&quot;: [
     *     {
     *       &quot;Callee&quot;: &quot;181<strong><strong>0000&quot;,
     *       &quot;Params&quot;: [
     *         &quot;张三&quot;,
     *         &quot;20&quot;
     *       ]
     *     },
     *     {
     *       &quot;Callee&quot;: &quot;181</strong></strong>0001&quot;,
     *       &quot;Params&quot;: [
     *         &quot;李四&quot;,
     *         &quot;21&quot;
     *       ]
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("CallString")
    public String callString;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The job ID. You can obtain the job ID from the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static AttachTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachTaskRequest self = new AttachTaskRequest();
        return TeaModel.build(map, self);
    }

    public AttachTaskRequest setCallString(String callString) {
        this.callString = callString;
        return this;
    }
    public String getCallString() {
        return this.callString;
    }

    public AttachTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
