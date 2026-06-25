// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeDisplayConfigResponseBody extends TeaModel {
    /**
     * <p>A list of display settings.</p>
     */
    @NameInMap("DisplayConfigModel")
    public java.util.List<DescribeDisplayConfigResponseBodyDisplayConfigModel> displayConfigModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FFEF7EFE-1E36-56D1-B5BF-5BACE43B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDisplayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisplayConfigResponseBody self = new DescribeDisplayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisplayConfigResponseBody setDisplayConfigModel(java.util.List<DescribeDisplayConfigResponseBodyDisplayConfigModel> displayConfigModel) {
        this.displayConfigModel = displayConfigModel;
        return this;
    }
    public java.util.List<DescribeDisplayConfigResponseBodyDisplayConfigModel> getDisplayConfigModel() {
        return this.displayConfigModel;
    }

    public DescribeDisplayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDisplayConfigResponseBodyDisplayConfigModel extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-jewjt8xryuituz4qn-****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The dots per inch (DPI). The value ranges from 72 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Dpi")
        public Integer dpi;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <p>Indicates whether the resolution is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        /**
         * <p>The height of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The width of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        public static DescribeDisplayConfigResponseBodyDisplayConfigModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisplayConfigResponseBodyDisplayConfigModel self = new DescribeDisplayConfigResponseBodyDisplayConfigModel();
            return TeaModel.build(map, self);
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setDpi(Integer dpi) {
            this.dpi = dpi;
            return this;
        }
        public Integer getDpi() {
            return this.dpi;
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setLockResolution(String lockResolution) {
            this.lockResolution = lockResolution;
            return this;
        }
        public String getLockResolution() {
            return this.lockResolution;
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeDisplayConfigResponseBodyDisplayConfigModel setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

    }

}
