// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListSensitiveWordResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用发送直播间弹幕的返回结果。
    @NameInMap("Result")
    public ListSensitiveWordResponseBodyResult result;

    public static ListSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveWordResponseBody self = new ListSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveWordResponseBody setResult(ListSensitiveWordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSensitiveWordResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSensitiveWordResponseBodyResult extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("WordList")
        public java.util.List<String> wordList;

        public static ListSensitiveWordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveWordResponseBodyResult self = new ListSensitiveWordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSensitiveWordResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListSensitiveWordResponseBodyResult setWordList(java.util.List<String> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<String> getWordList() {
            return this.wordList;
        }

    }

}
