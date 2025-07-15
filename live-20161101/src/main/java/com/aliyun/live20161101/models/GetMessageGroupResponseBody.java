// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>The time when the message group was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1502280113</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>as****hs</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Extension")
        public java.util.Map<String, ?> extension;

        /**
         * <p>The ID of the message group.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Indicates whether the message group is muted.</p>
         * <ul>
         * <li>true: The message group is muted.</li>
         * <li>false: The message group is not muted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMuteAll")
        public Boolean isMuteAll;

        /**
         * <p>The status of the message group. The default value is <strong>1</strong>, which indicates that the message group is normal.</p>
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
