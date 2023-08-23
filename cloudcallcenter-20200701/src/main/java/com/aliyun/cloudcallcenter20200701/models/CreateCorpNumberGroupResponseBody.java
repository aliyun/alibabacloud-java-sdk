// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateCorpNumberGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateCorpNumberGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCorpNumberGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpNumberGroupResponseBody self = new CreateCorpNumberGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCorpNumberGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCorpNumberGroupResponseBody setData(CreateCorpNumberGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCorpNumberGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateCorpNumberGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCorpNumberGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCorpNumberGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCorpNumberGroupResponseBodyData extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("NumberCount")
        public String numberCount;

        @NameInMap("NumberGroupId")
        public String numberGroupId;

        @NameInMap("NumberGroupName")
        public String numberGroupName;

        public static CreateCorpNumberGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCorpNumberGroupResponseBodyData self = new CreateCorpNumberGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCorpNumberGroupResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public CreateCorpNumberGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCorpNumberGroupResponseBodyData setNumberCount(String numberCount) {
            this.numberCount = numberCount;
            return this;
        }
        public String getNumberCount() {
            return this.numberCount;
        }

        public CreateCorpNumberGroupResponseBodyData setNumberGroupId(String numberGroupId) {
            this.numberGroupId = numberGroupId;
            return this;
        }
        public String getNumberGroupId() {
            return this.numberGroupId;
        }

        public CreateCorpNumberGroupResponseBodyData setNumberGroupName(String numberGroupName) {
            this.numberGroupName = numberGroupName;
            return this;
        }
        public String getNumberGroupName() {
            return this.numberGroupName;
        }

    }

}
