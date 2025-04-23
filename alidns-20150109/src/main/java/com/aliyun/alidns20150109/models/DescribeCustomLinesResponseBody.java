// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLinesResponseBody extends TeaModel {
    /**
     * <p>The custom lines.</p>
     */
    @NameInMap("CustomLines")
    public java.util.List<DescribeCustomLinesResponseBodyCustomLines> customLines;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of custom lines.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public static class DescribeCustomLinesResponseBodyCustomLinesIpSegmentList extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        public static DescribeCustomLinesResponseBodyCustomLinesIpSegmentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseBodyCustomLinesIpSegmentList self = new DescribeCustomLinesResponseBodyCustomLinesIpSegmentList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseBodyCustomLinesIpSegmentList setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public DescribeCustomLinesResponseBodyCustomLinesIpSegmentList setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

    public static class DescribeCustomLinesResponseBodyCustomLines extends TeaModel {
        /**
         * <p>The code of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>hra0yc-597</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>597</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IpSegmentList")
        public java.util.List<DescribeCustomLinesResponseBodyCustomLinesIpSegmentList> ipSegmentList;

        /**
         * <p>The name of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>hra0yd-597</p>
         */
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

        public DescribeCustomLinesResponseBodyCustomLines setIpSegmentList(java.util.List<DescribeCustomLinesResponseBodyCustomLinesIpSegmentList> ipSegmentList) {
            this.ipSegmentList = ipSegmentList;
            return this;
        }
        public java.util.List<DescribeCustomLinesResponseBodyCustomLinesIpSegmentList> getIpSegmentList() {
            return this.ipSegmentList;
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
