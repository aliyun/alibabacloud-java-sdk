// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CheckDcdnProjectExistResponseBody extends TeaModel {
    @NameInMap("Content")
    public CheckDcdnProjectExistResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDcdnProjectExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDcdnProjectExistResponseBody self = new CheckDcdnProjectExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDcdnProjectExistResponseBody setContent(CheckDcdnProjectExistResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CheckDcdnProjectExistResponseBodyContent getContent() {
        return this.content;
    }

    public CheckDcdnProjectExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckDcdnProjectExistResponseBodyContent extends TeaModel {
        @NameInMap("Exist")
        public String exist;

        public static CheckDcdnProjectExistResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CheckDcdnProjectExistResponseBodyContent self = new CheckDcdnProjectExistResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CheckDcdnProjectExistResponseBodyContent setExist(String exist) {
            this.exist = exist;
            return this;
        }
        public String getExist() {
            return this.exist;
        }

    }

}
