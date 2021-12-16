// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnEsExceptionDataResponseBody extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<DescribeDcdnEsExceptionDataResponseBodyContents> contents;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnEsExceptionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnEsExceptionDataResponseBody self = new DescribeDcdnEsExceptionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnEsExceptionDataResponseBody setContents(java.util.List<DescribeDcdnEsExceptionDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeDcdnEsExceptionDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public DescribeDcdnEsExceptionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnEsExceptionDataResponseBodyContents extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Name")
        public String name;

        @NameInMap("Points")
        public java.util.List<String> points;

        public static DescribeDcdnEsExceptionDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnEsExceptionDataResponseBodyContents self = new DescribeDcdnEsExceptionDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnEsExceptionDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeDcdnEsExceptionDataResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnEsExceptionDataResponseBodyContents setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

    }

}
