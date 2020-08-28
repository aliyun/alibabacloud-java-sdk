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

    public static class DescribeCustomLinesResponseCustomLines extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("IpSegments")
        @Validation(required = true)
        public String ipSegments;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        public static DescribeCustomLinesResponseCustomLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseCustomLines self = new DescribeCustomLinesResponseCustomLines();
            return TeaModel.build(map, self);
        }

    }

}
