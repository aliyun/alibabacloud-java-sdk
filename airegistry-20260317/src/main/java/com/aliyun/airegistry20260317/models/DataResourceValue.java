// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class DataResourceValue extends TeaModel {
    /**
     * <p>The resource name (including the file name extension).</p>
     * 
     * <strong>example:</strong>
     * <p>sample.md</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource type: template, data, script, etc.</p>
     * 
     * <strong>example:</strong>
     * <p>script</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The resource content.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a sample file.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The resource metadata.</p>
     */
    @NameInMap("Metadata")
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
