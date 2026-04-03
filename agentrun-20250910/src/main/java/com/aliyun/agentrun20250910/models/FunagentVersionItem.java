// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class FunagentVersionItem extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>多条更新说明</p>
     */
    @NameInMap("publishContent")
    public java.util.List<String> publishContent;

    /**
     * <p>日期或 ISO 8601 字符串</p>
     */
    @NameInMap("publishTime")
    public String publishTime;

    @NameInMap("version")
    public String version;

    public static FunagentVersionItem build(java.util.Map<String, ?> map) throws Exception {
        FunagentVersionItem self = new FunagentVersionItem();
        return TeaModel.build(map, self);
    }

    public FunagentVersionItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FunagentVersionItem setPublishContent(java.util.List<String> publishContent) {
        this.publishContent = publishContent;
        return this;
    }
    public java.util.List<String> getPublishContent() {
        return this.publishContent;
    }

    public FunagentVersionItem setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public FunagentVersionItem setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
