// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APMtest</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>apm-cn-i7m2fuae****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>es-cn-i7m2fsfhc001x****</p>
     */
    @NameInMap("output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListApmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApmRequest self = new ListApmRequest();
        return TeaModel.build(map, self);
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
