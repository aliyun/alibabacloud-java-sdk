// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetRecycleBinAttributeResponseBody extends TeaModel {
    /**
     * <p>The description of the recycle bin.</p>
     */
    @NameInMap("RecycleBinAttribute")
    public GetRecycleBinAttributeResponseBodyRecycleBinAttribute recycleBinAttribute;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecycleBinAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecycleBinAttributeResponseBody self = new GetRecycleBinAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecycleBinAttributeResponseBody setRecycleBinAttribute(GetRecycleBinAttributeResponseBodyRecycleBinAttribute recycleBinAttribute) {
        this.recycleBinAttribute = recycleBinAttribute;
        return this;
    }
    public GetRecycleBinAttributeResponseBodyRecycleBinAttribute getRecycleBinAttribute() {
        return this.recycleBinAttribute;
    }

    public GetRecycleBinAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRecycleBinAttributeResponseBodyRecycleBinAttribute extends TeaModel {
        /**
         * <p>The size of the archived data that is dumped to the recycle bin. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1611661312</p>
         */
        @NameInMap("ArchiveSize")
        public Long archiveSize;

        /**
         * <p>The time at which the recycle bin was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-30T10:08:08Z</p>
         */
        @NameInMap("EnableTime")
        public String enableTime;

        /**
         * <p>The retention period of the files in the recycle bin. Unit: days.</p>
         * <p>If the recycle bin is disabled, 0 is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReservedDays")
        public Long reservedDays;

        /**
         * <p>The size of the Infrequent Access (IA) data that is dumped to the recycle bin. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SecondarySize")
        public Long secondarySize;

        /**
         * <p>The size of the files that are dumped to the recycle bin. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The status of the recycle bin.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Enable: The recycle bin is enabled.</li>
         * <li>Disable: The recycle bin is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetRecycleBinAttributeResponseBodyRecycleBinAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetRecycleBinAttributeResponseBodyRecycleBinAttribute self = new GetRecycleBinAttributeResponseBodyRecycleBinAttribute();
            return TeaModel.build(map, self);
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setArchiveSize(Long archiveSize) {
            this.archiveSize = archiveSize;
            return this;
        }
        public Long getArchiveSize() {
            return this.archiveSize;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setEnableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public String getEnableTime() {
            return this.enableTime;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setReservedDays(Long reservedDays) {
            this.reservedDays = reservedDays;
            return this;
        }
        public Long getReservedDays() {
            return this.reservedDays;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setSecondarySize(Long secondarySize) {
            this.secondarySize = secondarySize;
            return this;
        }
        public Long getSecondarySize() {
            return this.secondarySize;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
