// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultReplicationRegionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The regions that support cross-region replication.</p>
     */
    @NameInMap("Regions")
    public DescribeVaultReplicationRegionsResponseBodyRegions regions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F4EEB401-DD21-588D-AE3B-1E835C7655E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeVaultReplicationRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultReplicationRegionsResponseBody self = new DescribeVaultReplicationRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVaultReplicationRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVaultReplicationRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVaultReplicationRegionsResponseBody setRegions(DescribeVaultReplicationRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeVaultReplicationRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeVaultReplicationRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVaultReplicationRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeVaultReplicationRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<String> regionId;

        public static DescribeVaultReplicationRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultReplicationRegionsResponseBodyRegions self = new DescribeVaultReplicationRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeVaultReplicationRegionsResponseBodyRegions setRegionId(java.util.List<String> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<String> getRegionId() {
            return this.regionId;
        }

    }

}
