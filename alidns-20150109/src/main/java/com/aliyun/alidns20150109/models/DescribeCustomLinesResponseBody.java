// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLinesResponseBody extends TeaModel {
    @NameInMap("CustomLines")
    public java.util.List<DescribeCustomLinesResponseBodyCustomLines> customLines;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeCustomLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLinesResponseBody self = new DescribeCustomLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLinesResponseBody setCustomLines(java.util.List<DescribeCustomLinesResponseBodyCustomLines> customLines) {
        this.customLines = customLines;
        return this;
    }
    public java.util.List<DescribeCustomLinesResponseBodyCustomLines> getCustomLines() {
        return this.customLines;
    }

    public DescribeCustomLinesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomLinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLinesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeCustomLinesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeCustomLinesResponseBodyCustomLines extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DescribeCustomLinesResponseBodyCustomLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseBodyCustomLines self = new DescribeCustomLinesResponseBodyCustomLines();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseBodyCustomLines setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCustomLinesResponseBodyCustomLines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomLinesResponseBodyCustomLines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
