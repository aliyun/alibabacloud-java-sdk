// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppSimpleListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppSimpleList")
    public java.util.List<DescribeAppSimpleListResponseBodyAppSimpleList> appSimpleList;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeAppSimpleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSimpleListResponseBody self = new DescribeAppSimpleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppSimpleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppSimpleListResponseBody setAppSimpleList(java.util.List<DescribeAppSimpleListResponseBodyAppSimpleList> appSimpleList) {
        this.appSimpleList = appSimpleList;
        return this;
    }
    public java.util.List<DescribeAppSimpleListResponseBodyAppSimpleList> getAppSimpleList() {
        return this.appSimpleList;
    }

    public DescribeAppSimpleListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeAppSimpleListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeAppSimpleListResponseBodyAppSimpleList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("NgAppId")
        public String ngAppId;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("EsnAppId")
        public String esnAppId;

        public static DescribeAppSimpleListResponseBodyAppSimpleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppSimpleListResponseBodyAppSimpleList self = new DescribeAppSimpleListResponseBodyAppSimpleList();
            return TeaModel.build(map, self);
        }

        public DescribeAppSimpleListResponseBodyAppSimpleList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppSimpleListResponseBodyAppSimpleList setNgAppId(String ngAppId) {
            this.ngAppId = ngAppId;
            return this;
        }
        public String getNgAppId() {
            return this.ngAppId;
        }

        public DescribeAppSimpleListResponseBodyAppSimpleList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppSimpleListResponseBodyAppSimpleList setEsnAppId(String esnAppId) {
            this.esnAppId = esnAppId;
            return this;
        }
        public String getEsnAppId() {
            return this.esnAppId;
        }

    }

}
