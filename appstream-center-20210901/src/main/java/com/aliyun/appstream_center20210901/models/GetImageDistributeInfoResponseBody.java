// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageDistributeInfoResponseBody extends TeaModel {
    /**
     * <p>The return code of the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The image information returned by the query.</p>
     */
    @NameInMap("Data")
    public GetImageDistributeInfoResponseBodyData data;

    /**
     * <p>The processing message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values: true: Successful. false: Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImageDistributeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageDistributeInfoResponseBody self = new GetImageDistributeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageDistributeInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageDistributeInfoResponseBody setData(GetImageDistributeInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageDistributeInfoResponseBodyData getData() {
        return this.data;
    }

    public GetImageDistributeInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageDistributeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageDistributeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageDistributeInfoResponseBodyDataImageRegionDistributeList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the ECS image corresponding to the region.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1example****</p>
         */
        @NameInMap("EcsImageId")
        public String ecsImageId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The processing information reported by the region distribution task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The distribution progress of the image in the region, expressed as a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the region to which the image is distributed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region distribution status.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The logical ID of the image on the unit side, which can be different from the central image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-1bdedef****</p>
         */
        @NameInMap("UnitImageId")
        public String unitImageId;

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetImageDistributeInfoResponseBodyDataImageRegionDistributeList build(java.util.Map<String, ?> map) throws Exception {
            GetImageDistributeInfoResponseBodyDataImageRegionDistributeList self = new GetImageDistributeInfoResponseBodyDataImageRegionDistributeList();
            return TeaModel.build(map, self);
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setEcsImageId(String ecsImageId) {
            this.ecsImageId = ecsImageId;
            return this;
        }
        public String getEcsImageId() {
            return this.ecsImageId;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setUnitImageId(String unitImageId) {
            this.unitImageId = unitImageId;
            return this;
        }
        public String getUnitImageId() {
            return this.unitImageId;
        }

        public GetImageDistributeInfoResponseBodyDataImageRegionDistributeList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetImageDistributeInfoResponseBodyData extends TeaModel {
        /**
         * <p>The list of region distribution information for the image version.</p>
         */
        @NameInMap("ImageRegionDistributeList")
        public java.util.List<GetImageDistributeInfoResponseBodyDataImageRegionDistributeList> imageRegionDistributeList;

        /**
         * <p>The list of region IDs supported by the image.</p>
         */
        @NameInMap("ImageRegionList")
        public java.util.List<String> imageRegionList;

        /**
         * <p>The source of the image. For example, center indicates the central image service.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("ImageSource")
        public String imageSource;

        public static GetImageDistributeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageDistributeInfoResponseBodyData self = new GetImageDistributeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageDistributeInfoResponseBodyData setImageRegionDistributeList(java.util.List<GetImageDistributeInfoResponseBodyDataImageRegionDistributeList> imageRegionDistributeList) {
            this.imageRegionDistributeList = imageRegionDistributeList;
            return this;
        }
        public java.util.List<GetImageDistributeInfoResponseBodyDataImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        public GetImageDistributeInfoResponseBodyData setImageRegionList(java.util.List<String> imageRegionList) {
            this.imageRegionList = imageRegionList;
            return this;
        }
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        public GetImageDistributeInfoResponseBodyData setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

    }

}
