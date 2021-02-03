// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLinesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("CustomLines")
    @Validation(required = true)
    public java.util.List<DescribeCustomLinesResponseCustomLines> customLines;

    public static DescribeCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLinesResponse self = new DescribeCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLinesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLinesResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeCustomLinesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomLinesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomLinesResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeCustomLinesResponse setCustomLines(java.util.List<DescribeCustomLinesResponseCustomLines> customLines) {
        this.customLines = customLines;
        return this;
    }
    public java.util.List<DescribeCustomLinesResponseCustomLines> getCustomLines() {
        return this.customLines;
    }

    public static class DescribeCustomLinesResponseCustomLines extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        public static DescribeCustomLinesResponseCustomLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseCustomLines self = new DescribeCustomLinesResponseCustomLines();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseCustomLines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomLinesResponseCustomLines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomLinesResponseCustomLines setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
