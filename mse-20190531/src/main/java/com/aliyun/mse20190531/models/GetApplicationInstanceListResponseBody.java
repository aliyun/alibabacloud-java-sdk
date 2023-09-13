// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationInstanceListResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetApplicationInstanceListResponseBodyData data;

    public static GetApplicationInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationInstanceListResponseBody self = new GetApplicationInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationInstanceListResponseBody setData(GetApplicationInstanceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationInstanceListResponseBodyData getData() {
        return this.data;
    }

    public static class GetApplicationInstanceListResponseBodyDataResultTags extends TeaModel {
        public static GetApplicationInstanceListResponseBodyDataResultTags build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationInstanceListResponseBodyDataResultTags self = new GetApplicationInstanceListResponseBodyDataResultTags();
            return TeaModel.build(map, self);
        }

    }

    public static class GetApplicationInstanceListResponseBodyDataResult extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("Tags")
        public java.util.List<GetApplicationInstanceListResponseBodyDataResultTags> tags;

        public static GetApplicationInstanceListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationInstanceListResponseBodyDataResult self = new GetApplicationInstanceListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetApplicationInstanceListResponseBodyDataResult setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetApplicationInstanceListResponseBodyDataResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetApplicationInstanceListResponseBodyDataResult setTags(java.util.List<GetApplicationInstanceListResponseBodyDataResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetApplicationInstanceListResponseBodyDataResultTags> getTags() {
            return this.tags;
        }

    }

    public static class GetApplicationInstanceListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetApplicationInstanceListResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetApplicationInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationInstanceListResponseBodyData self = new GetApplicationInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationInstanceListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetApplicationInstanceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetApplicationInstanceListResponseBodyData setResult(java.util.List<GetApplicationInstanceListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetApplicationInstanceListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetApplicationInstanceListResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
