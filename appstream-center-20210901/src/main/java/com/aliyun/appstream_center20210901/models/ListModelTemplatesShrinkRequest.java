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
     * <p>The name of the Agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

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
     * <p>Specifies whether models have been configured in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasModel")
    public Boolean hasModel;

    /**
     * <p>The list of template group IDs used for filtering.</p>
     */
    @NameInMap("ModelTemplateIdList")
    public String modelTemplateIdListShrink;

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

    public ListModelTemplatesShrinkRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
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

}
