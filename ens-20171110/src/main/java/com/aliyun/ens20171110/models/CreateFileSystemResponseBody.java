// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponseBody extends TeaModel {
    /**
     * <p>The information about the file system that was created.</p>
     */
    @NameInMap("AllocationId")
    public java.util.List<String> allocationId;

    @NameInMap("AllocationIds")
    public java.util.List<CreateFileSystemResponseBodyAllocationIds> allocationIds;

    /**
     * <p>The status code for successful operations. Valid values:</p>
     * <ul>
     * <li>PartSuccess: The operation is partially successful.</li>
     * <li>AllSuccess: The operation is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PartSuccess</p>
     */
    @NameInMap("BizStatusCode")
    public String bizStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the file system that failed to be created.</p>
     */
    @NameInMap("UnAllocationId")
    public java.util.List<String> unAllocationId;

    public static CreateFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponseBody self = new CreateFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponseBody setAllocationId(java.util.List<String> allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public java.util.List<String> getAllocationId() {
        return this.allocationId;
    }

    public CreateFileSystemResponseBody setAllocationIds(java.util.List<CreateFileSystemResponseBodyAllocationIds> allocationIds) {
        this.allocationIds = allocationIds;
        return this;
    }
    public java.util.List<CreateFileSystemResponseBodyAllocationIds> getAllocationIds() {
        return this.allocationIds;
    }

    public CreateFileSystemResponseBody setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public CreateFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileSystemResponseBody setUnAllocationId(java.util.List<String> unAllocationId) {
        this.unAllocationId = unAllocationId;
        return this;
    }
    public java.util.List<String> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static class CreateFileSystemResponseBodyAllocationIds extends TeaModel {
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateFileSystemResponseBodyAllocationIds build(java.util.Map<String, ?> map) throws Exception {
            CreateFileSystemResponseBodyAllocationIds self = new CreateFileSystemResponseBodyAllocationIds();
            return TeaModel.build(map, self);
        }

        public CreateFileSystemResponseBodyAllocationIds setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateFileSystemResponseBodyAllocationIds setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
