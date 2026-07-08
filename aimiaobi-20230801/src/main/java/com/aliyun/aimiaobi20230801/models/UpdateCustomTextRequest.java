// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateCustomTextRequest extends TeaModel {
    /**
     * <p>Workspace unique identifier: AgentKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Commodity code</p>
     * 
     * <strong>example:</strong>
     * <p>商品code</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>Content</p>
     * 
     * <strong>example:</strong>
     * <p>内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Primary key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Title</p>
     * 
     * <strong>example:</strong>
     * <p>标题</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateCustomTextRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTextRequest self = new UpdateCustomTextRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTextRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateCustomTextRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpdateCustomTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateCustomTextRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCustomTextRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
