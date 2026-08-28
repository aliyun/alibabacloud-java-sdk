// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DataResourceValue extends TeaModel {
    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>agentspec-example</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The metadata.</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    public static DataResourceValue build(java.util.Map<String, ?> map) throws Exception {
        DataResourceValue self = new DataResourceValue();
        return TeaModel.build(map, self);
    }

    public DataResourceValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataResourceValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataResourceValue setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DataResourceValue setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

}
