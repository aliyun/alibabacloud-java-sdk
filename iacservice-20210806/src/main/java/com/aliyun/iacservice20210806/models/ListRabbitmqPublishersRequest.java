// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRabbitmqPublishersRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListRabbitmqPublishersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRabbitmqPublishersRequest self = new ListRabbitmqPublishersRequest();
        return TeaModel.build(map, self);
    }

    public ListRabbitmqPublishersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRabbitmqPublishersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRabbitmqPublishersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
