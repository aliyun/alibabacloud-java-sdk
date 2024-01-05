// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListGraphSchemasRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("pageLimit")
    public String pageLimit;

    @NameInMap("pageStart")
    public String pageStart;

    @NameInMap("returnSpec")
    public String returnSpec;

    @NameInMap("schemaStatus")
    public String schemaStatus;

    public static ListGraphSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasRequest self = new ListGraphSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListGraphSchemasRequest setPageLimit(String pageLimit) {
        this.pageLimit = pageLimit;
        return this;
    }
    public String getPageLimit() {
        return this.pageLimit;
    }

    public ListGraphSchemasRequest setPageStart(String pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public String getPageStart() {
        return this.pageStart;
    }

    public ListGraphSchemasRequest setReturnSpec(String returnSpec) {
        this.returnSpec = returnSpec;
        return this;
    }
    public String getReturnSpec() {
        return this.returnSpec;
    }

    public ListGraphSchemasRequest setSchemaStatus(String schemaStatus) {
        this.schemaStatus = schemaStatus;
        return this;
    }
    public String getSchemaStatus() {
        return this.schemaStatus;
    }

}
