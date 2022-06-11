// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("description")
    public String description;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("output")
    public String output;

    @NameInMap("page")
    public Long page;

    @NameInMap("size")
    public Long size;

    public static ListApmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApmRequest self = new ListApmRequest();
        return TeaModel.build(map, self);
    }

    public ListApmRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListApmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApmRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApmRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ListApmRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListApmRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
