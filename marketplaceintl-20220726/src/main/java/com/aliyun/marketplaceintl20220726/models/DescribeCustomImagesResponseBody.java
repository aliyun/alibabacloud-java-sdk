// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCustomImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeCustomImagesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomImagesResponseBody self = new DescribeCustomImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomImagesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomImagesResponseBody setData(java.util.List<DescribeCustomImagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCustomImagesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCustomImagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCustomImagesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeCustomImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomImagesResponseBodyData extends TeaModel {
        @NameInMap("CreatedOn")
        public Long createdOn;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageSize")
        public Integer imageSize;

        @NameInMap("Osname")
        public String osname;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PlatformBit")
        public String platformBit;

        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("Region")
        public String region;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeCustomImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomImagesResponseBodyData self = new DescribeCustomImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomImagesResponseBodyData setCreatedOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }
        public Long getCreatedOn() {
            return this.createdOn;
        }

        public DescribeCustomImagesResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeCustomImagesResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeCustomImagesResponseBodyData setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Integer getImageSize() {
            return this.imageSize;
        }

        public DescribeCustomImagesResponseBodyData setOsname(String osname) {
            this.osname = osname;
            return this;
        }
        public String getOsname() {
            return this.osname;
        }

        public DescribeCustomImagesResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeCustomImagesResponseBodyData setPlatformBit(String platformBit) {
            this.platformBit = platformBit;
            return this;
        }
        public String getPlatformBit() {
            return this.platformBit;
        }

        public DescribeCustomImagesResponseBodyData setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public DescribeCustomImagesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeCustomImagesResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
