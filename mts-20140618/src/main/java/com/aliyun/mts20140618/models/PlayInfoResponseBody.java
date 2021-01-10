// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class PlayInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NotFoundCDNDomain")
    public PlayInfoResponseBodyNotFoundCDNDomain notFoundCDNDomain;

    @NameInMap("PlayInfoList")
    public PlayInfoResponseBodyPlayInfoList playInfoList;

    public static PlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlayInfoResponseBody self = new PlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public PlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlayInfoResponseBody setNotFoundCDNDomain(PlayInfoResponseBodyNotFoundCDNDomain notFoundCDNDomain) {
        this.notFoundCDNDomain = notFoundCDNDomain;
        return this;
    }
    public PlayInfoResponseBodyNotFoundCDNDomain getNotFoundCDNDomain() {
        return this.notFoundCDNDomain;
    }

    public PlayInfoResponseBody setPlayInfoList(PlayInfoResponseBodyPlayInfoList playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }
    public PlayInfoResponseBodyPlayInfoList getPlayInfoList() {
        return this.playInfoList;
    }

    public static class PlayInfoResponseBodyNotFoundCDNDomain extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static PlayInfoResponseBodyNotFoundCDNDomain build(java.util.Map<String, ?> map) throws Exception {
            PlayInfoResponseBodyNotFoundCDNDomain self = new PlayInfoResponseBodyNotFoundCDNDomain();
            return TeaModel.build(map, self);
        }

        public PlayInfoResponseBodyNotFoundCDNDomain setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class PlayInfoResponseBodyPlayInfoListPlayInfo extends TeaModel {
        @NameInMap("downloadType")
        public String downloadType;

        @NameInMap("width")
        public String width;

        @NameInMap("definition")
        public String definition;

        @NameInMap("rand")
        public String rand;

        @NameInMap("Url")
        public String url;

        @NameInMap("complexity")
        public String complexity;

        @NameInMap("encryption")
        public String encryption;

        @NameInMap("fps")
        public String fps;

        @NameInMap("encryptionType")
        public String encryptionType;

        @NameInMap("height")
        public String height;

        @NameInMap("activityName")
        public String activityName;

        @NameInMap("size")
        public String size;

        @NameInMap("bitrate")
        public String bitrate;

        @NameInMap("plaintext")
        public String plaintext;

        @NameInMap("duration")
        public String duration;

        @NameInMap("format")
        public String format;

        public static PlayInfoResponseBodyPlayInfoListPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            PlayInfoResponseBodyPlayInfoListPlayInfo self = new PlayInfoResponseBodyPlayInfoListPlayInfo();
            return TeaModel.build(map, self);
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setDownloadType(String downloadType) {
            this.downloadType = downloadType;
            return this;
        }
        public String getDownloadType() {
            return this.downloadType;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setRand(String rand) {
            this.rand = rand;
            return this;
        }
        public String getRand() {
            return this.rand;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setComplexity(String complexity) {
            this.complexity = complexity;
            return this;
        }
        public String getComplexity() {
            return this.complexity;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setPlaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }
        public String getPlaintext() {
            return this.plaintext;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public PlayInfoResponseBodyPlayInfoListPlayInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class PlayInfoResponseBodyPlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        public java.util.List<PlayInfoResponseBodyPlayInfoListPlayInfo> playInfo;

        public static PlayInfoResponseBodyPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            PlayInfoResponseBodyPlayInfoList self = new PlayInfoResponseBodyPlayInfoList();
            return TeaModel.build(map, self);
        }

        public PlayInfoResponseBodyPlayInfoList setPlayInfo(java.util.List<PlayInfoResponseBodyPlayInfoListPlayInfo> playInfo) {
            this.playInfo = playInfo;
            return this;
        }
        public java.util.List<PlayInfoResponseBodyPlayInfoListPlayInfo> getPlayInfo() {
            return this.playInfo;
        }

    }

}
