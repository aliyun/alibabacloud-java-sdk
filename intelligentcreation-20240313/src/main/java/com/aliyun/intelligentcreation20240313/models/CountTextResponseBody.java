// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CountTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6C9CB64D-E2D3-5BF2-A9E6-2445F952F178</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("countTextCmdList")
    public java.util.List<CountTextResponseBodyCountTextCmdList> countTextCmdList;

    public static CountTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountTextResponseBody self = new CountTextResponseBody();
        return TeaModel.build(map, self);
    }

    public CountTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountTextResponseBody setCountTextCmdList(java.util.List<CountTextResponseBodyCountTextCmdList> countTextCmdList) {
        this.countTextCmdList = countTextCmdList;
        return this;
    }
    public java.util.List<CountTextResponseBodyCountTextCmdList> getCountTextCmdList() {
        return this.countTextCmdList;
    }

    public static class CountTextResponseBodyCountTextCmdList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>RED_BOOK</p>
         */
        @NameInMap("theme")
        public String theme;

        public static CountTextResponseBodyCountTextCmdList build(java.util.Map<String, ?> map) throws Exception {
            CountTextResponseBodyCountTextCmdList self = new CountTextResponseBodyCountTextCmdList();
            return TeaModel.build(map, self);
        }

        public CountTextResponseBodyCountTextCmdList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public CountTextResponseBodyCountTextCmdList setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

}
