// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyDisplayConfigRequest extends TeaModel {
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    @NameInMap("DisplayConfig")
    public ModifyDisplayConfigRequestDisplayConfig displayConfig;

    public static ModifyDisplayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDisplayConfigRequest self = new ModifyDisplayConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDisplayConfigRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public ModifyDisplayConfigRequest setDisplayConfig(ModifyDisplayConfigRequestDisplayConfig displayConfig) {
        this.displayConfig = displayConfig;
        return this;
    }
    public ModifyDisplayConfigRequestDisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    public static class ModifyDisplayConfigRequestDisplayConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Dpi")
        public Integer dpi;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        public static ModifyDisplayConfigRequestDisplayConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDisplayConfigRequestDisplayConfig self = new ModifyDisplayConfigRequestDisplayConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDisplayConfigRequestDisplayConfig setDpi(Integer dpi) {
            this.dpi = dpi;
            return this;
        }
        public Integer getDpi() {
            return this.dpi;
        }

        public ModifyDisplayConfigRequestDisplayConfig setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public ModifyDisplayConfigRequestDisplayConfig setLockResolution(String lockResolution) {
            this.lockResolution = lockResolution;
            return this;
        }
        public String getLockResolution() {
            return this.lockResolution;
        }

        public ModifyDisplayConfigRequestDisplayConfig setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public ModifyDisplayConfigRequestDisplayConfig setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

    }

}
