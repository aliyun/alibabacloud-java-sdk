// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageGroupResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
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
        /**
         * <p>UTC timestamp when the message group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1502280113</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>as****hs</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Extension")
        public java.util.Map<String, ?> extension;

        /**
         * <p>Message group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Indicates whether all members in this message group are muted.</p>
         * <ul>
         * <li>true: All members are muted.</li>
         * <li>false: All members are not muted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMuteAll")
        public Boolean isMuteAll;

        /**
         * <p>Message group status. The default value is <strong>1</strong>, which indicates that the message group status is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
