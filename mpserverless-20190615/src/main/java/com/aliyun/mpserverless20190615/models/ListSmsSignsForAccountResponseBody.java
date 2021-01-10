// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSmsSignsForAccountResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SmsSigns")
    public java.util.List<ListSmsSignsForAccountResponseBodySmsSigns> smsSigns;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListSmsSignsForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignsForAccountResponseBody self = new ListSmsSignsForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsSignsForAccountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSmsSignsForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmsSignsForAccountResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSmsSignsForAccountResponseBody setSmsSigns(java.util.List<ListSmsSignsForAccountResponseBodySmsSigns> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }
    public java.util.List<ListSmsSignsForAccountResponseBodySmsSigns> getSmsSigns() {
        return this.smsSigns;
    }

    public ListSmsSignsForAccountResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListSmsSignsForAccountResponseBodySmsSigns extends TeaModel {
        @NameInMap("SignName")
        public String signName;

        public static ListSmsSignsForAccountResponseBodySmsSigns build(java.util.Map<String, ?> map) throws Exception {
            ListSmsSignsForAccountResponseBodySmsSigns self = new ListSmsSignsForAccountResponseBodySmsSigns();
            return TeaModel.build(map, self);
        }

        public ListSmsSignsForAccountResponseBodySmsSigns setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
