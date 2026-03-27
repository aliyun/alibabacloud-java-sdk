// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponseBody extends TeaModel {
    @NameInMap("Commands")
    public DescribeCommandsResponseBodyCommands commands;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of commands.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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

    public DescribeCommandsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("PatternRegex")
        public String patternRegex;

        @NameInMap("PossibleValues")
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinitionPossibleValues possibleValues;

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

        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitionsParameterDefinition setPatternRegex(String patternRegex) {
            this.patternRegex = patternRegex;
            return this;
        }
        public String getPatternRegex() {
            return this.patternRegex;
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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableParameter")
        public Boolean enableParameter;

        @NameInMap("InvokeTimes")
        public Integer invokeTimes;

        @NameInMap("Latest")
        public Boolean latest;

        @NameInMap("Launcher")
        public String launcher;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterDefinitions")
        public DescribeCommandsResponseBodyCommandsCommandParameterDefinitions parameterDefinitions;

        @NameInMap("ParameterNames")
        public DescribeCommandsResponseBodyCommandsCommandParameterNames parameterNames;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeCommandsResponseBodyCommandsCommandTags tags;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Integer version;

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

        public DescribeCommandsResponseBodyCommandsCommand setLauncher(String launcher) {
            this.launcher = launcher;
            return this;
        }
        public String getLauncher() {
            return this.launcher;
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
