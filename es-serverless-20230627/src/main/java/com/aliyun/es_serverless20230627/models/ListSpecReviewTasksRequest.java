// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListSpecReviewTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>QUOTA</p>
     */
    @NameInMap("type")
    public String type;

    public static ListSpecReviewTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpecReviewTasksRequest self = new ListSpecReviewTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListSpecReviewTasksRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSpecReviewTasksRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListSpecReviewTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
