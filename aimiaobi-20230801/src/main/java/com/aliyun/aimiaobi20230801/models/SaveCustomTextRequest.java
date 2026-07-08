// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveCustomTextRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>商品code</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>标题</p>
     */
    @NameInMap("Title")
    public String title;

    public static SaveCustomTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCustomTextRequest self = new SaveCustomTextRequest();
        return TeaModel.build(map, self);
    }

    public SaveCustomTextRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveCustomTextRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public SaveCustomTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveCustomTextRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
