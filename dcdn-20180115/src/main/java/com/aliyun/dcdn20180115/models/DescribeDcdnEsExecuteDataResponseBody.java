// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnEsExecuteDataResponseBody extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<DescribeDcdnEsExecuteDataResponseBodyContents> contents;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnEsExecuteDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnEsExecuteDataResponseBody self = new DescribeDcdnEsExecuteDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnEsExecuteDataResponseBody setContents(java.util.List<DescribeDcdnEsExecuteDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeDcdnEsExecuteDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public DescribeDcdnEsExecuteDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnEsExecuteDataResponseBodyContents extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Name")
        public String name;

        @NameInMap("Points")
        public java.util.List<String> points;

        public static DescribeDcdnEsExecuteDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnEsExecuteDataResponseBodyContents self = new DescribeDcdnEsExecuteDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnEsExecuteDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeDcdnEsExecuteDataResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnEsExecuteDataResponseBodyContents setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

    }

}
