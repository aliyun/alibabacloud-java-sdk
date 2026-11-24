// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The list of disk attachments.</p>
     */
    @NameInMap("DiskAttachments")
    public java.util.List<DescribeDiskAttachmentsResponseBodyDiskAttachments> diskAttachments;

    /**
     * <p>The maximum number of attachments returned in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that all attachments have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskAttachmentsResponseBody self = new DescribeDiskAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskAttachmentsResponseBody setDiskAttachments(java.util.List<DescribeDiskAttachmentsResponseBodyDiskAttachments> diskAttachments) {
        this.diskAttachments = diskAttachments;
        return this;
    }
    public java.util.List<DescribeDiskAttachmentsResponseBodyDiskAttachments> getDiskAttachments() {
        return this.diskAttachments;
    }

    public DescribeDiskAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiskAttachmentsResponseBodyDiskAttachments extends TeaModel {
        /**
         * <p>The time when the disk was successfully attached, in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T06:08:54Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The device name on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp131n0q38u3a4zi****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The ID of the instance to which the disk is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp18pnlg1ds9rky4****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDiskAttachmentsResponseBodyDiskAttachments build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskAttachmentsResponseBodyDiskAttachments self = new DescribeDiskAttachmentsResponseBodyDiskAttachments();
            return TeaModel.build(map, self);
        }

        public DescribeDiskAttachmentsResponseBodyDiskAttachments setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDiskAttachmentsResponseBodyDiskAttachments setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDiskAttachmentsResponseBodyDiskAttachments setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskAttachmentsResponseBodyDiskAttachments setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
