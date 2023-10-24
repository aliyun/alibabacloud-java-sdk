// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponseBody extends TeaModel {
    /**
     * <p>The queried commands.</p>
     */
    @NameInMap("Commands")
    public DescribeCommandsResponseBodyCommands commands;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of commands.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponseBody self = new DescribeCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponseBody setCommands(DescribeCommandsResponseBodyCommands commands) {
        this.commands = commands;
        return this;
    }
    public DescribeCommandsResponseBodyCommands getCommands() {
        return this.commands;
    }

    public DescribeCommandsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues extends TeaModel {
        @NameInMap("PossibleValue")
        public java.util.List<String> possibleValue;

        public static DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues self = new DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues setPossibleValue(java.util.List<String> possibleValue) {
            this.possibleValue = possibleValue;
            return this;
        }
        public java.util.List<String> getPossibleValue() {
            return this.possibleValue;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition extends TeaModel {
        /**
         * <p>The default value of the custom parameter.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the custom parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the custom parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The valid values of the custom enumeration parameter.</p>
         */
        @NameInMap("PossibleValues")
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues possibleValues;

        /**
         * <p>Indicates whether the custom parameter is required. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition self = new DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setPossibleValues(DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues getPossibleValues() {
            return this.possibleValues;
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommandParameterDefinitions extends TeaModel {
        @NameInMap("ParameterDefinition")
        public java.util.List<DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition> parameterDefinition;

        public static DescribeCommandsResponseBodyCommandsCommandParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandParameterDefinitions self = new DescribeCommandsResponseBodyCommandsCommandParameterDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitions setParameterDefinition(java.util.List<DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition> parameterDefinition) {
            this.parameterDefinition = parameterDefinition;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition> getParameterDefinition() {
            return this.parameterDefinition;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommandParameterNames extends TeaModel {
        @NameInMap("ParameterName")
        public java.util.List<String> parameterName;

        public static DescribeCommandsResponseBodyCommandsCommandParameterNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandParameterNames self = new DescribeCommandsResponseBodyCommandsCommandParameterNames();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandParameterNames setParameterName(java.util.List<String> parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public java.util.List<String> getParameterName() {
            return this.parameterName;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommandTagsTag extends TeaModel {
        /**
         * <p>The key of the tag of the command.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag of the command.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeCommandsResponseBodyCommandsCommandTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandTagsTag self = new DescribeCommandsResponseBodyCommandsCommandTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCommandsResponseBodyCommandsCommandTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommandTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCommandsResponseBodyCommandsCommandTagsTag> tag;

        public static DescribeCommandsResponseBodyCommandsCommandTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommandTags self = new DescribeCommandsResponseBodyCommandsCommandTags();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommandTags setTag(java.util.List<DescribeCommandsResponseBodyCommandsCommandTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsCommandTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsCommand extends TeaModel {
        /**
         * <p>The category of the common command.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The Base64-encoded command content.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The command ID.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The time when the command was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The command description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the custom parameter feature was enabled for the command.</p>
         */
        @NameInMap("EnableParameter")
        public Boolean enableParameter;

        /**
         * <p>The number of tasks created by using the command.</p>
         */
        @NameInMap("InvokeTimes")
        public Integer invokeTimes;

        /**
         * <p>Indicates whether the common command is of the latest version. If multiple common commands from the same provider (`Provider`) belong to the same category and share the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.</p>
         */
        @NameInMap("Latest")
        public Boolean latest;

        /**
         * <p>The command name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The custom parameters.</p>
         */
        @NameInMap("ParameterDefinitions")
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitions parameterDefinitions;

        /**
         * <p>The custom parameter names that are parsed from the command content specified when the command was being created. If the custom parameter feature is not enabled, an empty list is returned.</p>
         */
        @NameInMap("ParameterNames")
        public DescribeCommandsResponseBodyCommandsCommandParameterNames parameterNames;

        /**
         * <p>The provider of the common command.</p>
         */
        @NameInMap("Provider")
        public String provider;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the command.</p>
         */
        @NameInMap("Tags")
        public DescribeCommandsResponseBodyCommandsCommandTags tags;

        /**
         * <p>The timeout period.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The command type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the common command. If multiple common commands from the same provider (`Provider`) belong to the same category and share the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The working directory of the command.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeCommandsResponseBodyCommandsCommand build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsCommand self = new DescribeCommandsResponseBodyCommandsCommand();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsCommand setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCommandsResponseBodyCommandsCommand setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandsResponseBodyCommandsCommand setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandsResponseBodyCommandsCommand setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandsResponseBodyCommandsCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommandsCommand setEnableParameter(Boolean enableParameter) {
            this.enableParameter = enableParameter;
            return this;
        }
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        public DescribeCommandsResponseBodyCommandsCommand setInvokeTimes(Integer invokeTimes) {
            this.invokeTimes = invokeTimes;
            return this;
        }
        public Integer getInvokeTimes() {
            return this.invokeTimes;
        }

        public DescribeCommandsResponseBodyCommandsCommand setLatest(Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Boolean getLatest() {
            return this.latest;
        }

        public DescribeCommandsResponseBodyCommandsCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommandsResponseBodyCommandsCommand setParameterDefinitions(DescribeCommandsResponseBodyCommandsCommandParameterDefinitions parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitions getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public DescribeCommandsResponseBodyCommandsCommand setParameterNames(DescribeCommandsResponseBodyCommandsCommandParameterNames parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public DescribeCommandsResponseBodyCommandsCommandParameterNames getParameterNames() {
            return this.parameterNames;
        }

        public DescribeCommandsResponseBodyCommandsCommand setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeCommandsResponseBodyCommandsCommand setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCommandsResponseBodyCommandsCommand setTags(DescribeCommandsResponseBodyCommandsCommandTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCommandsResponseBodyCommandsCommandTags getTags() {
            return this.tags;
        }

        public DescribeCommandsResponseBodyCommandsCommand setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandsResponseBodyCommandsCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCommandsResponseBodyCommandsCommand setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public DescribeCommandsResponseBodyCommandsCommand setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeCommandsResponseBodyCommands extends TeaModel {
        @NameInMap("Command")
        public java.util.List<DescribeCommandsResponseBodyCommandsCommand> command;

        public static DescribeCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommands self = new DescribeCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommands setCommand(java.util.List<DescribeCommandsResponseBodyCommandsCommand> command) {
            this.command = command;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsCommand> getCommand() {
            return this.command;
        }

    }

}
