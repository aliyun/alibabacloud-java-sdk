// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetMessageGroupResponseBodyResult result;

    public static GetMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageGroupResponseBody self = new GetMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageGroupResponseBody setResult(GetMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Extension")
        public java.util.Map<String, ?> extension;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsMuteAll")
        public Boolean isMuteAll;

        @NameInMap("Status")
        public Integer status;

        public static GetMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMessageGroupResponseBodyResult self = new GetMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMessageGroupResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMessageGroupResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetMessageGroupResponseBodyResult setExtension(java.util.Map<String, ?> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, ?> getExtension() {
            return this.extension;
        }

        public GetMessageGroupResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetMessageGroupResponseBodyResult setIsMuteAll(Boolean isMuteAll) {
            this.isMuteAll = isMuteAll;
            return this;
        }
        public Boolean getIsMuteAll() {
            return this.isMuteAll;
        }

        public GetMessageGroupResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
