// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>The Agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The Agent platform list. Supports COMMON. If specified together with AgentPlatform, AgentPlatform takes precedence and this list is ignored. Defaults to ENTERPRISE if no platform filter is specified. To query Common model groups, explicitly include COMMON. If filtering by Provider simultaneously, set the value to Common.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatformList")
    public java.util.List<String> agentPlatformList;

    /**
     * <p>The Agent provider name.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The Agent provider list. Supports Common. If specified together with AgentProvider, AgentProvider takes precedence and this list is ignored. To query Common model groups, explicitly include COMMON in the platform filter.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProviderList")
    public java.util.List<String> agentProviderList;

    /**
     * <p>The business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>Specifies whether models are configured in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasModel")
    public Boolean hasModel;

    /**
     * <p>The list of template group IDs to filter by.</p>
     */
    @NameInMap("ModelTemplateIdList")
    public String modelTemplateIdListShrink;

    /**
     * <p>The model group name. Fuzzy match is supported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number, starting from 1. Values 0 and 1 return the same result.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The authorization scope filter. Valid values: ALL_USER, USER_MIXED, or RESOURCE_MIXED (strictly uppercase. Case variants or unknown values return InvalidParameter). If not specified, no filtering is applied. Unlike create/update operations, the filter scenario allows RESOURCE_MIXED (to filter non-Common model groups).</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_USER</p>
     */
    @NameInMap("RefScope")
    public String refScope;

    /**
     * <p>The template source filter. Valid values:</p>
     * <ul>
     * <li>User: tenant-created (default if not specified).</li>
     * <li>System: system preset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListModelTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplatesShrinkRequest self = new ListModelTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelTemplatesShrinkRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListModelTemplatesShrinkRequest setAgentPlatformList(java.util.List<String> agentPlatformList) {
        this.agentPlatformList = agentPlatformList;
        return this;
    }
    public java.util.List<String> getAgentPlatformList() {
        return this.agentPlatformList;
    }

    public ListModelTemplatesShrinkRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ListModelTemplatesShrinkRequest setAgentProviderList(java.util.List<String> agentProviderList) {
        this.agentProviderList = agentProviderList;
        return this;
    }
    public java.util.List<String> getAgentProviderList() {
        return this.agentProviderList;
    }

    public ListModelTemplatesShrinkRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListModelTemplatesShrinkRequest setHasModel(Boolean hasModel) {
        this.hasModel = hasModel;
        return this;
    }
    public Boolean getHasModel() {
        return this.hasModel;
    }

    public ListModelTemplatesShrinkRequest setModelTemplateIdListShrink(String modelTemplateIdListShrink) {
        this.modelTemplateIdListShrink = modelTemplateIdListShrink;
        return this;
    }
    public String getModelTemplateIdListShrink() {
        return this.modelTemplateIdListShrink;
    }

    public ListModelTemplatesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelTemplatesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelTemplatesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelTemplatesShrinkRequest setRefScope(String refScope) {
        this.refScope = refScope;
        return this;
    }
    public String getRefScope() {
        return this.refScope;
    }

    public ListModelTemplatesShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
