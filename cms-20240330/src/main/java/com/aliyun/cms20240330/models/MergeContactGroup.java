// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeContactGroup extends TeaModel {
    /**
     * <p>The list of unique identifiers for members in the group.</p>
     */
    @NameInMap("contacts")
    public java.util.List<String> contacts;

    /**
     * <p>The extension field used to store additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;department&quot;: &quot;O&amp;M Department&quot;, &quot;role&quot;: &quot;Engineer&quot; }</p>
     */
    @NameInMap("extend")
    public java.util.Map<String, ?> extend;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The unique identifier of the contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>group-12345</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>The name of the contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>O&amp;M Team</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source system of the contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("source")
    public String source;

    public static MergeContactGroup build(java.util.Map<String, ?> map) throws Exception {
        MergeContactGroup self = new MergeContactGroup();
        return TeaModel.build(map, self);
    }

    public MergeContactGroup setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public MergeContactGroup setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public MergeContactGroup setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MergeContactGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MergeContactGroup setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MergeContactGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MergeContactGroup setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
