// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetCreativeInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetCreativeInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCreativeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreativeInfoResponseBody self = new GetCreativeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreativeInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCreativeInfoResponseBody setData(GetCreativeInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCreativeInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCreativeInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCreativeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreativeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCreativeInfoResponseBodyData extends TeaModel {
        @NameInMap("AccountNo")
        public String accountNo;

        @NameInMap("ChainValue")
        public String chainValue;

        @NameInMap("ComponentIdList")
        public String componentIdList;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MainId")
        public Long mainId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PageId")
        public String pageId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskCount")
        public Integer taskCount;

        @NameInMap("Url")
        public String url;

        @NameInMap("UrlType")
        public String urlType;

        public static GetCreativeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCreativeInfoResponseBodyData self = new GetCreativeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCreativeInfoResponseBodyData setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public GetCreativeInfoResponseBodyData setChainValue(String chainValue) {
            this.chainValue = chainValue;
            return this;
        }
        public String getChainValue() {
            return this.chainValue;
        }

        public GetCreativeInfoResponseBodyData setComponentIdList(String componentIdList) {
            this.componentIdList = componentIdList;
            return this;
        }
        public String getComponentIdList() {
            return this.componentIdList;
        }

        public GetCreativeInfoResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetCreativeInfoResponseBodyData setMainId(Long mainId) {
            this.mainId = mainId;
            return this;
        }
        public Long getMainId() {
            return this.mainId;
        }

        public GetCreativeInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCreativeInfoResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public GetCreativeInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetCreativeInfoResponseBodyData setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public GetCreativeInfoResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetCreativeInfoResponseBodyData setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

}
