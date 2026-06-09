// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Namespace extends TeaModel {
    /**
     * <p>命名空间所属的数据目录名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>命名空间的备注描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>测试命名空间</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>命名空间的唯一标识名称</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>命名空间的扩展属性</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    public static Namespace build(java.util.Map<String, ?> map) throws Exception {
        Namespace self = new Namespace();
        return TeaModel.build(map, self);
    }

    public Namespace setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public Namespace setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Namespace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Namespace setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
