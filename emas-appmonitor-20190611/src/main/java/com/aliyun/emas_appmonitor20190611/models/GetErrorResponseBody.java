// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorResponseBody extends TeaModel {
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetErrorResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>A8313212-EB4E-4E15-A7F9-D9C8F3FE8E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorResponseBody self = new GetErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public GetErrorResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetErrorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErrorResponseBody setModel(GetErrorResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetErrorResponseBodyModel getModel() {
        return this.model;
    }

    public GetErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErrorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetErrorResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4G</p>
         */
        @NameInMap("Access")
        public String access;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AccessSubType")
        public String accessSubType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AdditionalCallbackInfo")
        public String additionalCallbackInfo;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AdditionalCrossPlatformCrashInfo")
        public String additionalCrossPlatformCrashInfo;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AdditionalCustomInfo")
        public String additionalCustomInfo;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AndroidVm")
        public String androidVm;

        /**
         * <strong>example:</strong>
         * <p>ALIPUBDC3CA71131027</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>233588686</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>V20250224102631</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ArgHash")
        public Long argHash;

        /**
         * <strong>example:</strong>
         * <p>h=60</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException: Attempt to invoke virtual method \&quot;java.lang.Object</p>
         */
        @NameInMap("Backtrace")
        public String backtrace;

        /**
         * <p>banner</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Banner")
        public String banner;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("BinaryUuids")
        public String binaryUuids;

        /**
         * <strong>example:</strong>
         * <p>Hinova</p>
         */
        @NameInMap("Brand")
        public String brand;

        /**
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("BrowserName")
        public String browserName;

        @NameInMap("BrowserVersion")
        public String browserVersion;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Build")
        public String build;

        /**
         * <strong>example:</strong>
         * <p>china</p>
         */
        @NameInMap("BusinessCountry")
        public String businessCountry;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("BusinessErrorExtData")
        public String businessErrorExtData;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("BusinessLogType")
        public String businessLogType;

        /**
         * <p>carrier</p>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <strong>example:</strong>
         * <p>ant</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>375</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>100.104.16.217:51534</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        @NameInMap("ClientTime")
        public Long clientTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ColNo")
        public String colNo;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>arm</p>
         */
        @NameInMap("CpuModel")
        public String cpuModel;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CruxModule")
        public String cruxModule;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CruxStack")
        public String cruxStack;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CruxStackHash")
        public Long cruxStackHash;

        /**
         * <p>CruxStackTrace</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CruxStackTrace")
        public String cruxStackTrace;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CruxStackTraceHash")
        public Long cruxStackTraceHash;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CustomExceptionType")
        public String customExceptionType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CustomInfo")
        public String customInfo;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DataDirectory")
        public String dataDirectory;

        /**
         * <strong>example:</strong>
         * <p>ad-0001t9c1b6y48kqcd44s-105</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>ASUS_X00GD</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <strong>example:</strong>
         * <p>22jtJ213saqfB1yBgBKhayYPwcZ2</p>
         */
        @NameInMap("Did")
        public String did;

        /**
         * <strong>example:</strong>
         * <p>sha256:b3b79f1f6c2beca7ac93a9518a35d542e0bfeb7ae64c9e57e9edd4719489927c</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DigestHash")
        public String digestHash;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("DomScore")
        public String domScore;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DownloadCacheDirectory")
        public String downloadCacheDirectory;

        /**
         * <strong>example:</strong>
         * <p>OOM</p>
         */
        @NameInMap("ErrorName")
        public String errorName;

        /**
         * <strong>example:</strong>
         * <p>jsError</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <strong>example:</strong>
         * <p>0DB-22jtJZzBvqfB1yBgBKhayYPwcZ2</p>
         */
        @NameInMap("EventId")
        public Integer eventId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("EventLog")
        public String eventLog;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionArg1")
        public String exceptionArg1;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionArg2")
        public String exceptionArg2;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionArg3")
        public String exceptionArg3;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionCodes")
        public String exceptionCodes;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionDetail")
        public String exceptionDetail;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionId")
        public String exceptionId;

        /**
         * <strong>example:</strong>
         * <p>Table \&quot;123_temp.image_vw_6191426\&quot; doesn\&quot;t exist</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionSubtype")
        public String exceptionSubtype;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionType")
        public String exceptionType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionVersion")
        public String exceptionVersion;

        /**
         * <strong>example:</strong>
         * <p>exporting</p>
         */
        @NameInMap("ExportStatus")
        public String exportStatus;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExternalStorageDirectory")
        public String externalStorageDirectory;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("FeatureScene")
        public String featureScene;

        /**
         * <strong>example:</strong>
         * <p>baselineCspm_20241005</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>dubhe-service/src/main/java/com/viatris/dubhe/monitortask/service/Impl/DataSyncMonitorRecordServiceImpl.java</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>chunk-56494f41.3df8bd75.css</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("FlutterRoute")
        public String flutterRoute;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForceGround")
        public Integer forceGround;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForeGround")
        public Integer foreGround;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("H5FullUrl")
        public String h5FullUrl;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("H5ShortUrl")
        public String h5ShortUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasOpenMultiProcessMode")
        public Integer hasOpenMultiProcessMode;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("HasSdCard")
        public Integer hasSdCard;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasSgSecurityConfigKey")
        public Integer hasSgSecurityConfigKey;

        /**
         * <p>IMEI</p>
         * 
         * <strong>example:</strong>
         * <p>2704b9b0d94b2f3897f82119a1900cd9c7a8108d</p>
         */
        @NameInMap("Imei")
        public String imei;

        /**
         * <p>IMSI</p>
         * 
         * <strong>example:</strong>
         * <p>460049842500442</p>
         */
        @NameInMap("Imsi")
        public String imsi;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InMainProcess")
        public Integer inMainProcess;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("InstallSdCard")
        public Integer installSdCard;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("IsBackTrace")
        public Integer isBackTrace;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsSpeedVersion")
        public Integer isSpeedVersion;

        /**
         * <p>ISP</p>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException: Attempt to invoke virtual method \&quot;java.lang.Object</p>
         */
        @NameInMap("JsBacktrace")
        public String jsBacktrace;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>2025-02-25 18:02:50</p>
         */
        @NameInMap("LaunchedTime")
        public String launchedTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LineNo")
        public String lineNo;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("LogHash")
        public Long logHash;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MainLog")
        public String mainLog;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MemoryMap")
        public String memoryMap;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MoreInfo1")
        public String moreInfo1;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MoreInfo2")
        public String moreInfo2;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MoreInfo3")
        public String moreInfo3;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NativeAllThreadDump")
        public String nativeAllThreadDump;

        /**
         * <p>Native map</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NativeMaps")
        public String nativeMaps;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NeedReCluster")
        public Integer needReCluster;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OpenedFileCount")
        public Integer openedFileCount;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;status\&quot;:1,\&quot;target\&quot;:\&quot;5461e0ab-340f-4a6b-9bbe-f75e44985420\&quot;}]</p>
         */
        @NameInMap("Operations")
        public String operations;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("OriginData")
        public String originData;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OriginUri")
        public String originUri;

        /**
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Content\&quot;: [], \&quot;TotalPages\&quot;: 2, \&quot;TotalItems\&quot;: 31, \&quot;PageNumber\&quot;: 4, \&quot;PageSize\&quot;: 20}</p>
         */
        @NameInMap("Page")
        public String page;

        /**
         * <strong>example:</strong>
         * <p>com.aliyun.demo</p>
         */
        @NameInMap("ParentProcessName")
        public String parentProcessName;

        /**
         * <strong>example:</strong>
         * <p>ce0ak81asd@62706c656a7f1a1</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <strong>example:</strong>
         * <p>wechat</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("Province")
        public String province;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ReportContent")
        public String reportContent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <strong>example:</strong>
         * <p>720*1280</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RootDirectory")
        public String rootDirectory;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RuntimeExtData")
        public String runtimeExtData;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SceneValue")
        public String sceneValue;

        /**
         * <strong>example:</strong>
         * <p>software_nls_tts_offline_standard</p>
         */
        @NameInMap("SdkType")
        public String sdkType;

        /**
         * <strong>example:</strong>
         * <p>5.2.3</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        /**
         * <strong>example:</strong>
         * <p>3481243636390427020</p>
         */
        @NameInMap("Seq")
        public String seq;

        /**
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        @NameInMap("ServerTime")
        public Long serverTime;

        /**
         * <strong>example:</strong>
         * <p>9ec8e399-51cc-4283-8ba4-f6df78246249</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SimpleReportContent")
        public String simpleReportContent;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SoLibBuild")
        public String soLibBuild;

        /**
         * <p>SpeedFlags</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SpeedFlags")
        public String speedFlags;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException: Attempt to invoke virtual method \&quot;java.lang.Object java.lang.ref.WeakReference.get()\&quot; on a null object reference</p>
         */
        @NameInMap("Stack")
        public String stack;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;HandledCheckToday\&quot;: 0, \&quot;RiskCheckCnt\&quot;: 34, \&quot;RiskWarningCnt\&quot;: 57, \&quot;RiskDays\&quot;: 30, \&quot;HandledCheckTotal\&quot;: 5, \&quot;HandledDays\&quot;: 365}</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SymbolicFileType")
        public String symbolicFileType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SysLog")
        public String sysLog;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ThreadName")
        public String threadName;

        /**
         * <strong>example:</strong>
         * <p>Process Name: \&quot;com.muyuan.mytongdriver\&quot;
         * Thread Name: \&quot;main\&quot;</p>
         */
        @NameInMap("Threads")
        public String threads;

        /**
         * <strong>example:</strong>
         * <p>2359</p>
         */
        @NameInMap("Tid")
        public Integer tid;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Track")
        public String track;

        /**
         * <strong>example:</strong>
         * <p>2025-02-25 18:02:50</p>
         */
        @NameInMap("TriggeredTime")
        public String triggeredTime;

        /**
         * <strong>example:</strong>
         * <p>1740412800000</p>
         */
        @NameInMap("UploadTime")
        public Long uploadTime;

        /**
         * <p>URI</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.aliyuncs.com/aliyun_id_photo_bucket/default_handsome.jpg">https://oss.aliyuncs.com/aliyun_id_photo_bucket/default_handsome.jpg</a></p>
         */
        @NameInMap("Uri")
        public String uri;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("User")
        public String user;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>mark</p>
         */
        @NameInMap("UserNick")
        public String userNick;

        /**
         * <p>utdid</p>
         * 
         * <strong>example:</strong>
         * <p>2704b9b0d94b2f3897f82119a</p>
         */
        @NameInMap("Utdid")
        public String utdid;

        /**
         * <p>uuid</p>
         * 
         * <strong>example:</strong>
         * <p>105a87c6-f299-42e5-8fc7-1066a47a96e5</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>view</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.view1</p>
         */
        @NameInMap("View")
        public String view;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("WeexFullUrl")
        public String weexFullUrl;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("WeexShortUrl")
        public String weexShortUrl;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("WriteLimit")
        public Integer writeLimit;

        public static GetErrorResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetErrorResponseBodyModel self = new GetErrorResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetErrorResponseBodyModel setAccess(String access) {
            this.access = access;
            return this;
        }
        public String getAccess() {
            return this.access;
        }

        public GetErrorResponseBodyModel setAccessSubType(String accessSubType) {
            this.accessSubType = accessSubType;
            return this;
        }
        public String getAccessSubType() {
            return this.accessSubType;
        }

        public GetErrorResponseBodyModel setAdditionalCallbackInfo(String additionalCallbackInfo) {
            this.additionalCallbackInfo = additionalCallbackInfo;
            return this;
        }
        public String getAdditionalCallbackInfo() {
            return this.additionalCallbackInfo;
        }

        public GetErrorResponseBodyModel setAdditionalCrossPlatformCrashInfo(String additionalCrossPlatformCrashInfo) {
            this.additionalCrossPlatformCrashInfo = additionalCrossPlatformCrashInfo;
            return this;
        }
        public String getAdditionalCrossPlatformCrashInfo() {
            return this.additionalCrossPlatformCrashInfo;
        }

        public GetErrorResponseBodyModel setAdditionalCustomInfo(String additionalCustomInfo) {
            this.additionalCustomInfo = additionalCustomInfo;
            return this;
        }
        public String getAdditionalCustomInfo() {
            return this.additionalCustomInfo;
        }

        public GetErrorResponseBodyModel setAndroidVm(String androidVm) {
            this.androidVm = androidVm;
            return this;
        }
        public String getAndroidVm() {
            return this.androidVm;
        }

        public GetErrorResponseBodyModel setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetErrorResponseBodyModel setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public GetErrorResponseBodyModel setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetErrorResponseBodyModel setArgHash(Long argHash) {
            this.argHash = argHash;
            return this;
        }
        public Long getArgHash() {
            return this.argHash;
        }

        public GetErrorResponseBodyModel setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetErrorResponseBodyModel setBacktrace(String backtrace) {
            this.backtrace = backtrace;
            return this;
        }
        public String getBacktrace() {
            return this.backtrace;
        }

        public GetErrorResponseBodyModel setBanner(String banner) {
            this.banner = banner;
            return this;
        }
        public String getBanner() {
            return this.banner;
        }

        public GetErrorResponseBodyModel setBinaryUuids(String binaryUuids) {
            this.binaryUuids = binaryUuids;
            return this;
        }
        public String getBinaryUuids() {
            return this.binaryUuids;
        }

        public GetErrorResponseBodyModel setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public GetErrorResponseBodyModel setBrowserName(String browserName) {
            this.browserName = browserName;
            return this;
        }
        public String getBrowserName() {
            return this.browserName;
        }

        public GetErrorResponseBodyModel setBrowserVersion(String browserVersion) {
            this.browserVersion = browserVersion;
            return this;
        }
        public String getBrowserVersion() {
            return this.browserVersion;
        }

        public GetErrorResponseBodyModel setBuild(String build) {
            this.build = build;
            return this;
        }
        public String getBuild() {
            return this.build;
        }

        public GetErrorResponseBodyModel setBusinessCountry(String businessCountry) {
            this.businessCountry = businessCountry;
            return this;
        }
        public String getBusinessCountry() {
            return this.businessCountry;
        }

        public GetErrorResponseBodyModel setBusinessErrorExtData(String businessErrorExtData) {
            this.businessErrorExtData = businessErrorExtData;
            return this;
        }
        public String getBusinessErrorExtData() {
            return this.businessErrorExtData;
        }

        public GetErrorResponseBodyModel setBusinessLogType(String businessLogType) {
            this.businessLogType = businessLogType;
            return this;
        }
        public String getBusinessLogType() {
            return this.businessLogType;
        }

        public GetErrorResponseBodyModel setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public GetErrorResponseBodyModel setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetErrorResponseBodyModel setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetErrorResponseBodyModel setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetErrorResponseBodyModel setClientTime(Long clientTime) {
            this.clientTime = clientTime;
            return this;
        }
        public Long getClientTime() {
            return this.clientTime;
        }

        public GetErrorResponseBodyModel setColNo(String colNo) {
            this.colNo = colNo;
            return this;
        }
        public String getColNo() {
            return this.colNo;
        }

        public GetErrorResponseBodyModel setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetErrorResponseBodyModel setCpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
            return this;
        }
        public String getCpuModel() {
            return this.cpuModel;
        }

        public GetErrorResponseBodyModel setCruxModule(String cruxModule) {
            this.cruxModule = cruxModule;
            return this;
        }
        public String getCruxModule() {
            return this.cruxModule;
        }

        public GetErrorResponseBodyModel setCruxStack(String cruxStack) {
            this.cruxStack = cruxStack;
            return this;
        }
        public String getCruxStack() {
            return this.cruxStack;
        }

        public GetErrorResponseBodyModel setCruxStackHash(Long cruxStackHash) {
            this.cruxStackHash = cruxStackHash;
            return this;
        }
        public Long getCruxStackHash() {
            return this.cruxStackHash;
        }

        public GetErrorResponseBodyModel setCruxStackTrace(String cruxStackTrace) {
            this.cruxStackTrace = cruxStackTrace;
            return this;
        }
        public String getCruxStackTrace() {
            return this.cruxStackTrace;
        }

        public GetErrorResponseBodyModel setCruxStackTraceHash(Long cruxStackTraceHash) {
            this.cruxStackTraceHash = cruxStackTraceHash;
            return this;
        }
        public Long getCruxStackTraceHash() {
            return this.cruxStackTraceHash;
        }

        public GetErrorResponseBodyModel setCustomExceptionType(String customExceptionType) {
            this.customExceptionType = customExceptionType;
            return this;
        }
        public String getCustomExceptionType() {
            return this.customExceptionType;
        }

        public GetErrorResponseBodyModel setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }
        public String getCustomInfo() {
            return this.customInfo;
        }

        public GetErrorResponseBodyModel setDataDirectory(String dataDirectory) {
            this.dataDirectory = dataDirectory;
            return this;
        }
        public String getDataDirectory() {
            return this.dataDirectory;
        }

        public GetErrorResponseBodyModel setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetErrorResponseBodyModel setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetErrorResponseBodyModel setDid(String did) {
            this.did = did;
            return this;
        }
        public String getDid() {
            return this.did;
        }

        public GetErrorResponseBodyModel setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetErrorResponseBodyModel setDigestHash(String digestHash) {
            this.digestHash = digestHash;
            return this;
        }
        public String getDigestHash() {
            return this.digestHash;
        }

        public GetErrorResponseBodyModel setDomScore(String domScore) {
            this.domScore = domScore;
            return this;
        }
        public String getDomScore() {
            return this.domScore;
        }

        public GetErrorResponseBodyModel setDownloadCacheDirectory(String downloadCacheDirectory) {
            this.downloadCacheDirectory = downloadCacheDirectory;
            return this;
        }
        public String getDownloadCacheDirectory() {
            return this.downloadCacheDirectory;
        }

        public GetErrorResponseBodyModel setErrorName(String errorName) {
            this.errorName = errorName;
            return this;
        }
        public String getErrorName() {
            return this.errorName;
        }

        public GetErrorResponseBodyModel setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public GetErrorResponseBodyModel setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public GetErrorResponseBodyModel setEventLog(String eventLog) {
            this.eventLog = eventLog;
            return this;
        }
        public String getEventLog() {
            return this.eventLog;
        }

        public GetErrorResponseBodyModel setExceptionArg1(String exceptionArg1) {
            this.exceptionArg1 = exceptionArg1;
            return this;
        }
        public String getExceptionArg1() {
            return this.exceptionArg1;
        }

        public GetErrorResponseBodyModel setExceptionArg2(String exceptionArg2) {
            this.exceptionArg2 = exceptionArg2;
            return this;
        }
        public String getExceptionArg2() {
            return this.exceptionArg2;
        }

        public GetErrorResponseBodyModel setExceptionArg3(String exceptionArg3) {
            this.exceptionArg3 = exceptionArg3;
            return this;
        }
        public String getExceptionArg3() {
            return this.exceptionArg3;
        }

        public GetErrorResponseBodyModel setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetErrorResponseBodyModel setExceptionCodes(String exceptionCodes) {
            this.exceptionCodes = exceptionCodes;
            return this;
        }
        public String getExceptionCodes() {
            return this.exceptionCodes;
        }

        public GetErrorResponseBodyModel setExceptionDetail(String exceptionDetail) {
            this.exceptionDetail = exceptionDetail;
            return this;
        }
        public String getExceptionDetail() {
            return this.exceptionDetail;
        }

        public GetErrorResponseBodyModel setExceptionId(String exceptionId) {
            this.exceptionId = exceptionId;
            return this;
        }
        public String getExceptionId() {
            return this.exceptionId;
        }

        public GetErrorResponseBodyModel setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public GetErrorResponseBodyModel setExceptionSubtype(String exceptionSubtype) {
            this.exceptionSubtype = exceptionSubtype;
            return this;
        }
        public String getExceptionSubtype() {
            return this.exceptionSubtype;
        }

        public GetErrorResponseBodyModel setExceptionType(String exceptionType) {
            this.exceptionType = exceptionType;
            return this;
        }
        public String getExceptionType() {
            return this.exceptionType;
        }

        public GetErrorResponseBodyModel setExceptionVersion(String exceptionVersion) {
            this.exceptionVersion = exceptionVersion;
            return this;
        }
        public String getExceptionVersion() {
            return this.exceptionVersion;
        }

        public GetErrorResponseBodyModel setExportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }
        public String getExportStatus() {
            return this.exportStatus;
        }

        public GetErrorResponseBodyModel setExternalStorageDirectory(String externalStorageDirectory) {
            this.externalStorageDirectory = externalStorageDirectory;
            return this;
        }
        public String getExternalStorageDirectory() {
            return this.externalStorageDirectory;
        }

        public GetErrorResponseBodyModel setFeatureScene(String featureScene) {
            this.featureScene = featureScene;
            return this;
        }
        public String getFeatureScene() {
            return this.featureScene;
        }

        public GetErrorResponseBodyModel setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetErrorResponseBodyModel setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetErrorResponseBodyModel setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public GetErrorResponseBodyModel setFlutterRoute(String flutterRoute) {
            this.flutterRoute = flutterRoute;
            return this;
        }
        public String getFlutterRoute() {
            return this.flutterRoute;
        }

        public GetErrorResponseBodyModel setForceGround(Integer forceGround) {
            this.forceGround = forceGround;
            return this;
        }
        public Integer getForceGround() {
            return this.forceGround;
        }

        public GetErrorResponseBodyModel setForeGround(Integer foreGround) {
            this.foreGround = foreGround;
            return this;
        }
        public Integer getForeGround() {
            return this.foreGround;
        }

        public GetErrorResponseBodyModel setH5FullUrl(String h5FullUrl) {
            this.h5FullUrl = h5FullUrl;
            return this;
        }
        public String getH5FullUrl() {
            return this.h5FullUrl;
        }

        public GetErrorResponseBodyModel setH5ShortUrl(String h5ShortUrl) {
            this.h5ShortUrl = h5ShortUrl;
            return this;
        }
        public String getH5ShortUrl() {
            return this.h5ShortUrl;
        }

        public GetErrorResponseBodyModel setHasOpenMultiProcessMode(Integer hasOpenMultiProcessMode) {
            this.hasOpenMultiProcessMode = hasOpenMultiProcessMode;
            return this;
        }
        public Integer getHasOpenMultiProcessMode() {
            return this.hasOpenMultiProcessMode;
        }

        public GetErrorResponseBodyModel setHasSdCard(Integer hasSdCard) {
            this.hasSdCard = hasSdCard;
            return this;
        }
        public Integer getHasSdCard() {
            return this.hasSdCard;
        }

        public GetErrorResponseBodyModel setHasSgSecurityConfigKey(Integer hasSgSecurityConfigKey) {
            this.hasSgSecurityConfigKey = hasSgSecurityConfigKey;
            return this;
        }
        public Integer getHasSgSecurityConfigKey() {
            return this.hasSgSecurityConfigKey;
        }

        public GetErrorResponseBodyModel setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public GetErrorResponseBodyModel setImsi(String imsi) {
            this.imsi = imsi;
            return this;
        }
        public String getImsi() {
            return this.imsi;
        }

        public GetErrorResponseBodyModel setInMainProcess(Integer inMainProcess) {
            this.inMainProcess = inMainProcess;
            return this;
        }
        public Integer getInMainProcess() {
            return this.inMainProcess;
        }

        public GetErrorResponseBodyModel setInstallSdCard(Integer installSdCard) {
            this.installSdCard = installSdCard;
            return this;
        }
        public Integer getInstallSdCard() {
            return this.installSdCard;
        }

        public GetErrorResponseBodyModel setIsBackTrace(Integer isBackTrace) {
            this.isBackTrace = isBackTrace;
            return this;
        }
        public Integer getIsBackTrace() {
            return this.isBackTrace;
        }

        public GetErrorResponseBodyModel setIsSpeedVersion(Integer isSpeedVersion) {
            this.isSpeedVersion = isSpeedVersion;
            return this;
        }
        public Integer getIsSpeedVersion() {
            return this.isSpeedVersion;
        }

        public GetErrorResponseBodyModel setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetErrorResponseBodyModel setJsBacktrace(String jsBacktrace) {
            this.jsBacktrace = jsBacktrace;
            return this;
        }
        public String getJsBacktrace() {
            return this.jsBacktrace;
        }

        public GetErrorResponseBodyModel setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetErrorResponseBodyModel setLaunchedTime(String launchedTime) {
            this.launchedTime = launchedTime;
            return this;
        }
        public String getLaunchedTime() {
            return this.launchedTime;
        }

        public GetErrorResponseBodyModel setLineNo(String lineNo) {
            this.lineNo = lineNo;
            return this;
        }
        public String getLineNo() {
            return this.lineNo;
        }

        public GetErrorResponseBodyModel setLogHash(Long logHash) {
            this.logHash = logHash;
            return this;
        }
        public Long getLogHash() {
            return this.logHash;
        }

        public GetErrorResponseBodyModel setMainLog(String mainLog) {
            this.mainLog = mainLog;
            return this;
        }
        public String getMainLog() {
            return this.mainLog;
        }

        public GetErrorResponseBodyModel setMemoryMap(String memoryMap) {
            this.memoryMap = memoryMap;
            return this;
        }
        public String getMemoryMap() {
            return this.memoryMap;
        }

        public GetErrorResponseBodyModel setMoreInfo1(String moreInfo1) {
            this.moreInfo1 = moreInfo1;
            return this;
        }
        public String getMoreInfo1() {
            return this.moreInfo1;
        }

        public GetErrorResponseBodyModel setMoreInfo2(String moreInfo2) {
            this.moreInfo2 = moreInfo2;
            return this;
        }
        public String getMoreInfo2() {
            return this.moreInfo2;
        }

        public GetErrorResponseBodyModel setMoreInfo3(String moreInfo3) {
            this.moreInfo3 = moreInfo3;
            return this;
        }
        public String getMoreInfo3() {
            return this.moreInfo3;
        }

        public GetErrorResponseBodyModel setNativeAllThreadDump(String nativeAllThreadDump) {
            this.nativeAllThreadDump = nativeAllThreadDump;
            return this;
        }
        public String getNativeAllThreadDump() {
            return this.nativeAllThreadDump;
        }

        public GetErrorResponseBodyModel setNativeMaps(String nativeMaps) {
            this.nativeMaps = nativeMaps;
            return this;
        }
        public String getNativeMaps() {
            return this.nativeMaps;
        }

        public GetErrorResponseBodyModel setNeedReCluster(Integer needReCluster) {
            this.needReCluster = needReCluster;
            return this;
        }
        public Integer getNeedReCluster() {
            return this.needReCluster;
        }

        public GetErrorResponseBodyModel setOpenedFileCount(Integer openedFileCount) {
            this.openedFileCount = openedFileCount;
            return this;
        }
        public Integer getOpenedFileCount() {
            return this.openedFileCount;
        }

        public GetErrorResponseBodyModel setOperations(String operations) {
            this.operations = operations;
            return this;
        }
        public String getOperations() {
            return this.operations;
        }

        public GetErrorResponseBodyModel setOriginData(String originData) {
            this.originData = originData;
            return this;
        }
        public String getOriginData() {
            return this.originData;
        }

        public GetErrorResponseBodyModel setOriginUri(String originUri) {
            this.originUri = originUri;
            return this;
        }
        public String getOriginUri() {
            return this.originUri;
        }

        public GetErrorResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetErrorResponseBodyModel setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public GetErrorResponseBodyModel setPage(String page) {
            this.page = page;
            return this;
        }
        public String getPage() {
            return this.page;
        }

        public GetErrorResponseBodyModel setParentProcessName(String parentProcessName) {
            this.parentProcessName = parentProcessName;
            return this;
        }
        public String getParentProcessName() {
            return this.parentProcessName;
        }

        public GetErrorResponseBodyModel setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public GetErrorResponseBodyModel setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetErrorResponseBodyModel setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetErrorResponseBodyModel setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetErrorResponseBodyModel setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetErrorResponseBodyModel setReportContent(String reportContent) {
            this.reportContent = reportContent;
            return this;
        }
        public String getReportContent() {
            return this.reportContent;
        }

        public GetErrorResponseBodyModel setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public GetErrorResponseBodyModel setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetErrorResponseBodyModel setRootDirectory(String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public String getRootDirectory() {
            return this.rootDirectory;
        }

        public GetErrorResponseBodyModel setRuntimeExtData(String runtimeExtData) {
            this.runtimeExtData = runtimeExtData;
            return this;
        }
        public String getRuntimeExtData() {
            return this.runtimeExtData;
        }

        public GetErrorResponseBodyModel setSceneValue(String sceneValue) {
            this.sceneValue = sceneValue;
            return this;
        }
        public String getSceneValue() {
            return this.sceneValue;
        }

        public GetErrorResponseBodyModel setSdkType(String sdkType) {
            this.sdkType = sdkType;
            return this;
        }
        public String getSdkType() {
            return this.sdkType;
        }

        public GetErrorResponseBodyModel setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public GetErrorResponseBodyModel setSeq(String seq) {
            this.seq = seq;
            return this;
        }
        public String getSeq() {
            return this.seq;
        }

        public GetErrorResponseBodyModel setServerTime(Long serverTime) {
            this.serverTime = serverTime;
            return this;
        }
        public Long getServerTime() {
            return this.serverTime;
        }

        public GetErrorResponseBodyModel setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetErrorResponseBodyModel setSimpleReportContent(String simpleReportContent) {
            this.simpleReportContent = simpleReportContent;
            return this;
        }
        public String getSimpleReportContent() {
            return this.simpleReportContent;
        }

        public GetErrorResponseBodyModel setSoLibBuild(String soLibBuild) {
            this.soLibBuild = soLibBuild;
            return this;
        }
        public String getSoLibBuild() {
            return this.soLibBuild;
        }

        public GetErrorResponseBodyModel setSpeedFlags(String speedFlags) {
            this.speedFlags = speedFlags;
            return this;
        }
        public String getSpeedFlags() {
            return this.speedFlags;
        }

        public GetErrorResponseBodyModel setStack(String stack) {
            this.stack = stack;
            return this;
        }
        public String getStack() {
            return this.stack;
        }

        public GetErrorResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErrorResponseBodyModel setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetErrorResponseBodyModel setSymbolicFileType(String symbolicFileType) {
            this.symbolicFileType = symbolicFileType;
            return this;
        }
        public String getSymbolicFileType() {
            return this.symbolicFileType;
        }

        public GetErrorResponseBodyModel setSysLog(String sysLog) {
            this.sysLog = sysLog;
            return this;
        }
        public String getSysLog() {
            return this.sysLog;
        }

        public GetErrorResponseBodyModel setThreadName(String threadName) {
            this.threadName = threadName;
            return this;
        }
        public String getThreadName() {
            return this.threadName;
        }

        public GetErrorResponseBodyModel setThreads(String threads) {
            this.threads = threads;
            return this;
        }
        public String getThreads() {
            return this.threads;
        }

        public GetErrorResponseBodyModel setTid(Integer tid) {
            this.tid = tid;
            return this;
        }
        public Integer getTid() {
            return this.tid;
        }

        public GetErrorResponseBodyModel setTrack(String track) {
            this.track = track;
            return this;
        }
        public String getTrack() {
            return this.track;
        }

        public GetErrorResponseBodyModel setTriggeredTime(String triggeredTime) {
            this.triggeredTime = triggeredTime;
            return this;
        }
        public String getTriggeredTime() {
            return this.triggeredTime;
        }

        public GetErrorResponseBodyModel setUploadTime(Long uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public Long getUploadTime() {
            return this.uploadTime;
        }

        public GetErrorResponseBodyModel setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public GetErrorResponseBodyModel setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetErrorResponseBodyModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetErrorResponseBodyModel setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public GetErrorResponseBodyModel setUtdid(String utdid) {
            this.utdid = utdid;
            return this;
        }
        public String getUtdid() {
            return this.utdid;
        }

        public GetErrorResponseBodyModel setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetErrorResponseBodyModel setView(String view) {
            this.view = view;
            return this;
        }
        public String getView() {
            return this.view;
        }

        public GetErrorResponseBodyModel setWeexFullUrl(String weexFullUrl) {
            this.weexFullUrl = weexFullUrl;
            return this;
        }
        public String getWeexFullUrl() {
            return this.weexFullUrl;
        }

        public GetErrorResponseBodyModel setWeexShortUrl(String weexShortUrl) {
            this.weexShortUrl = weexShortUrl;
            return this;
        }
        public String getWeexShortUrl() {
            return this.weexShortUrl;
        }

        public GetErrorResponseBodyModel setWriteLimit(Integer writeLimit) {
            this.writeLimit = writeLimit;
            return this;
        }
        public Integer getWriteLimit() {
            return this.writeLimit;
        }

    }

}
