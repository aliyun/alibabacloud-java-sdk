// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListModelingClassificationsRequest extends TeaModel {
    @NameInMap("ClassificationName")
    public String classificationName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListModelingClassificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelingClassificationsRequest self = new ListModelingClassificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelingClassificationsRequest setClassificationName(String classificationName) {
        this.classificationName = classificationName;
        return this;
    }
    public String getClassificationName() {
        return this.classificationName;
    }

    public ListModelingClassificationsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListModelingClassificationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
