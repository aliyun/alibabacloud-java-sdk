// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RunAppInstanceCommandRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group, which is used to execute commands in a single delivery group. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the ID. This parameter is required if AppInstanceGroupIds is not specified. Otherwise, a parameter error is returned. This parameter does not take effect if AppInstanceGroupIds is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The list of delivery group IDs, which is used to issue commands in batches to multiple delivery groups in the same region. The commands are executed on all persistent sessions in each delivery group in the list, and only one command execution ID is returned. A maximum of 100 delivery group IDs are supported, and duplicate IDs are deduplicated. All delivery groups must belong to the same region. Otherwise, InvalidRegion.NotMatch is returned. If any delivery group does not exist, InvalidAppInstanceGroup.NotFound is returned. When this parameter is specified, AppInstanceGroupId and AppInstancePersistentIds do not take effect.</p>
     */
    @NameInMap("AppInstanceGroupIds")
    public java.util.List<String> appInstanceGroupIds;

    /**
     * <p>The ID of the persistent session, which is used to select a single persistent session in the delivery group specified by AppInstanceGroupId to execute commands. The session must belong to the specified delivery group. Otherwise, an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The list of persistent session IDs, which is used to select multiple persistent sessions in the delivery group specified by AppInstanceGroupId to execute commands. A maximum of 100 IDs are supported. This parameter does not take effect when AppInstanceGroupIds is specified, and the commands are executed on all persistent sessions in each delivery group.</p>
     */
    @NameInMap("AppInstancePersistentIds")
    public java.util.List<String> appInstancePersistentIds;

    /**
     * <p>The command content, which is the script content executed in the session. It must match the script type specified by RunScriptType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>echo hello</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The command parameters, which are passed through to the session execution end along with the command content. Whether to pass them and the specific format depend on the command content. You can leave this parameter empty if it is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("CommandParam")
    public String commandParam;

    /**
     * <p>The command type. Currently, only CloudAssistantCmd (Cloud Assistant command) is supported. Specifying other values returns a parameter error.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudAssistantCmd</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The command description, which is used to describe the purpose of the issued command for subsequent identification.</p>
     * 
     * <strong>example:</strong>
     * <p>Clean up temporary files</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product type. Currently, only WuyingServer (WUYING Workspace) is supported. Specifying other values returns a parameter error.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The type of the script to execute. Valid values:</p>
     * <ul>
     * <li>RunBatScript: bat script</li>
     * <li>RunPowerShellScript: PowerShell script</li>
     * <li>RunShellScript: shell script</li>
     * <li>RunAIAgentScript: AI Agent script</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("RunScriptType")
    public String runScriptType;

    /**
     * <p>The timeout period for command execution, in seconds. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static RunAppInstanceCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAppInstanceCommandRequest self = new RunAppInstanceCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunAppInstanceCommandRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public RunAppInstanceCommandRequest setAppInstanceGroupIds(java.util.List<String> appInstanceGroupIds) {
        this.appInstanceGroupIds = appInstanceGroupIds;
        return this;
    }
    public java.util.List<String> getAppInstanceGroupIds() {
        return this.appInstanceGroupIds;
    }

    public RunAppInstanceCommandRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public RunAppInstanceCommandRequest setAppInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
        this.appInstancePersistentIds = appInstancePersistentIds;
        return this;
    }
    public java.util.List<String> getAppInstancePersistentIds() {
        return this.appInstancePersistentIds;
    }

    public RunAppInstanceCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunAppInstanceCommandRequest setCommandParam(String commandParam) {
        this.commandParam = commandParam;
        return this;
    }
    public String getCommandParam() {
        return this.commandParam;
    }

    public RunAppInstanceCommandRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public RunAppInstanceCommandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunAppInstanceCommandRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RunAppInstanceCommandRequest setRunScriptType(String runScriptType) {
        this.runScriptType = runScriptType;
        return this;
    }
    public String getRunScriptType() {
        return this.runScriptType;
    }

    public RunAppInstanceCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
