// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConsoleMessagesResponseBody extends TeaModel {
    /**
     * <p>The list of console messages queried on the current page. If no messages match, an empty list is returned.</p>
     */
    @NameInMap("MessageList")
    public java.util.List<DescribeConsoleMessagesResponseBodyMessageList> messageList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9F1D7E42-06A8-4B50-9A21-6E0C8D3F5B72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of messages that match the query conditions, not the number of messages returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeConsoleMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleMessagesResponseBody self = new DescribeConsoleMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleMessagesResponseBody setMessageList(java.util.List<DescribeConsoleMessagesResponseBodyMessageList> messageList) {
        this.messageList = messageList;
        return this;
    }
    public java.util.List<DescribeConsoleMessagesResponseBodyMessageList> getMessageList() {
        return this.messageList;
    }

    public DescribeConsoleMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsoleMessagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeConsoleMessagesResponseBodyMessageListContentConfigs extends TeaModel {
        /**
         * <p>The color of the body text, which retains the color value saved when the message was created or modified.</p>
         * 
         * <strong>example:</strong>
         * <p>#666666</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The message body text in the specified language.</p>
         * 
         * <strong>example:</strong>
         * <p>The cloud computer will undergo routine maintenance. Please save your work in advance</p>
         */
        @NameInMap("ContentText")
        public String contentText;

        /**
         * <p>The body language. Valid values: CN (Chinese), EN (English), and JP (Japanese). The query returns the language value saved when the message was created or modified, retaining the original case.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("LangType")
        public String langType;

        public static DescribeConsoleMessagesResponseBodyMessageListContentConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageListContentConfigs self = new DescribeConsoleMessagesResponseBodyMessageListContentConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageListContentConfigs setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeConsoleMessagesResponseBodyMessageListContentConfigs setContentText(String contentText) {
            this.contentText = contentText;
            return this;
        }
        public String getContentText() {
            return this.contentText;
        }

        public DescribeConsoleMessagesResponseBodyMessageListContentConfigs setLangType(String langType) {
            this.langType = langType;
            return this;
        }
        public String getLangType() {
            return this.langType;
        }

    }

    public static class DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs extends TeaModel {
        /**
         * <p>The text displayed on the hyperlink button.</p>
         * 
         * <strong>example:</strong>
         * <p>View Details</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL accessed after clicking the hyperlink button.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/announcements/maintenance">https://example.com/announcements/maintenance</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs self = new DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeConsoleMessagesResponseBodyMessageListImageInfoList extends TeaModel {
        /**
         * <p>The name of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>img0.jpg</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The storage path of the image file.</p>
         * 
         * <strong>example:</strong>
         * <p>image_file/CUSTOM_WALLPAPER/00000000-0000-img0.jpg</p>
         */
        @NameInMap("ImageFilePath")
        public String imageFilePath;

        /**
         * <p>The image type. Configuration types defined by the backend include Operational (operational message image), WallpaperBasic (basic wallpaper image), and WallpaperAppend (appended wallpaper image). The query returns the image type value saved when the message was created or modified, retaining the original case.</p>
         * 
         * <strong>example:</strong>
         * <p>WallpaperBasic</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The temporary download URL of the image file. The link has a limited validity period. If it expires, you can query again to obtain a new one.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/img0.jpg">https://example.com/images/img0.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static DescribeConsoleMessagesResponseBodyMessageListImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageListImageInfoList self = new DescribeConsoleMessagesResponseBodyMessageListImageInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageListImageInfoList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeConsoleMessagesResponseBodyMessageListImageInfoList setImageFilePath(String imageFilePath) {
            this.imageFilePath = imageFilePath;
            return this;
        }
        public String getImageFilePath() {
            return this.imageFilePath;
        }

        public DescribeConsoleMessagesResponseBodyMessageListImageInfoList setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeConsoleMessagesResponseBodyMessageListImageInfoList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class DescribeConsoleMessagesResponseBodyMessageListMetaData extends TeaModel {
        /**
         * <p>The AD domain name associated with the message configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ad.example.com</p>
         */
        @NameInMap("AdDomain")
        public String adDomain;

        /**
         * <p>The workspace ID associated with the message configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-example01</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The list of scheduled sending configurations. If TimerType is CRON, the elements are cron expressions. If TimerType is Timestamp, the elements are millisecond timestamps represented as strings.</p>
         */
        @NameInMap("Timer")
        public java.util.List<String> timer;

        /**
         * <p>The scheduled sending type. Valid values: CRON (cron expression) and Timestamp (timestamp). The configuration values are case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>CRON</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static DescribeConsoleMessagesResponseBodyMessageListMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageListMetaData self = new DescribeConsoleMessagesResponseBodyMessageListMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageListMetaData setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public DescribeConsoleMessagesResponseBodyMessageListMetaData setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeConsoleMessagesResponseBodyMessageListMetaData setTimer(java.util.List<String> timer) {
            this.timer = timer;
            return this;
        }
        public java.util.List<String> getTimer() {
            return this.timer;
        }

        public DescribeConsoleMessagesResponseBodyMessageListMetaData setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class DescribeConsoleMessagesResponseBodyMessageListTitleConfigs extends TeaModel {
        /**
         * <p>The color of the title text, which retains the color value saved when the message was created or modified.</p>
         * 
         * <strong>example:</strong>
         * <p>#333333</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The title language. Valid values: CN (Chinese), EN (English), and JP (Japanese). The query returns the language value saved when the message was created or modified, retaining the original case.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("LangType")
        public String langType;

        /**
         * <p>The message title text in the specified language.</p>
         * 
         * <strong>example:</strong>
         * <p>System Maintenance Notice</p>
         */
        @NameInMap("TitleText")
        public String titleText;

        public static DescribeConsoleMessagesResponseBodyMessageListTitleConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageListTitleConfigs self = new DescribeConsoleMessagesResponseBodyMessageListTitleConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageListTitleConfigs setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeConsoleMessagesResponseBodyMessageListTitleConfigs setLangType(String langType) {
            this.langType = langType;
            return this;
        }
        public String getLangType() {
            return this.langType;
        }

        public DescribeConsoleMessagesResponseBodyMessageListTitleConfigs setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }
        public String getTitleText() {
            return this.titleText;
        }

    }

    public static class DescribeConsoleMessagesResponseBodyMessageList extends TeaModel {
        /**
         * <p>The list of client types to which the message applies. Standard names are returned: Windows, Mac, Web, and Hardware.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<String> clientTypes;

        /**
         * <p>The list of message body configurations for each language.</p>
         */
        @NameInMap("ContentConfigs")
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListContentConfigs> contentConfigs;

        /**
         * <p>The time when the operational message stops taking effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-11T02:00:00.000+00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the message was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T00:00:00.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the message was last modified. This time is also updated when the message status changes.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T01:00:00.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The list of hyperlink button configurations in the message.</p>
         */
        @NameInMap("HyperLinkConfigs")
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs> hyperLinkConfigs;

        /**
         * <p>The storage path of the image file for the operational message.</p>
         * 
         * <strong>example:</strong>
         * <p>image_file/OPERATIONAL/00000000-0000-console-message.png</p>
         */
        @NameInMap("ImageFilePath")
        public String imageFilePath;

        /**
         * <p>The list of image configurations, which is mainly used for custom wallpaper messages. Each item includes the image name, image type, storage path, and temporary download URL.</p>
         */
        @NameInMap("ImageInfoList")
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListImageInfoList> imageInfoList;

        /**
         * <p>The temporary download URL of the operational message image. The link has a limited validity period. If it expires, you can query again to obtain a new one.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/console-message.png">https://example.com/images/console-message.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The message ID, which can be used to send, modify, or delete a specified message.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-123456</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The message level of the notification message. Valid values: STRONG (strong message) and WEAK (weak message).</p>
         * 
         * <strong>example:</strong>
         * <p>STRONG</p>
         */
        @NameInMap("MessageLevel")
        public String messageLevel;

        /**
         * <p>The message type. Valid values: OPERATIONAL (client operational message), WALLPAPER (desktop wallpaper text message), NOTIFICATION (message center notification), and CUSTOM_WALLPAPER (custom desktop wallpaper).</p>
         * 
         * <strong>example:</strong>
         * <p>NOTIFICATION</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The additional configuration of the message, including the associated workspace, AD domain name, and scheduled sending configuration. Whether specific fields are returned depends on the message type and its saved configuration.</p>
         */
        @NameInMap("MetaData")
        public DescribeConsoleMessagesResponseBodyMessageListMetaData metaData;

        /**
         * <p>The display position of the message. For wallpaper text messages, valid values are CENTER (center), TOP_RIGHT (top right), BOTTOM_RIGHT (bottom right), and BOTTOM_LEFT (bottom left). For client operational messages, valid values are CLIENT_ENTERPRISE_RESOURCE_PAGE (Enterprise Edition client cloud resource page) and CLIENT_BUSINESS_RESOURCE_PAGE (Business Edition client cloud resource page).</p>
         * 
         * <strong>example:</strong>
         * <p>CENTER</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>The time when the operational message starts taking effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T02:00:00.000+00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The current status of the message. Valid values: Init (initializing), Pushing (pushing), Published (published), Expired (expired), Deleting (deleting), and Failed (failed). Published indicates that the message has been published or the server has finished pushing, but it does not indicate that all target terminals have successfully received the message.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The JSON string of the list of targets to which the message applies. For Organization and AdOrg, it is an array of objects containing orgId (organization ID) and orgName (organization name). The organization name may be empty, and records in the old format may not contain orgName. For Tag, it is an array of objects containing tagKey (tag key), tagValue (tag value), and regionId (region ID). For other target types, it is an array of strings. The target for all users is represented by ALL_USERS.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;user01&quot;]</p>
         */
        @NameInMap("TargetIds")
        public String targetIds;

        /**
         * <p>The type of the target to which the message applies. Valid values: AllUsers (all convenience users), EndUser (specified convenience user), Organization (specified convenience user organization), Desktop (cloud computer), ResourceGroup (resource group), Region (region), Tag (tag), AdAllUsers (all AD users), AdUser (specified AD user), and AdOrg (specified AD organization).</p>
         * 
         * <strong>example:</strong>
         * <p>EndUser</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The list of message title configurations for each language.</p>
         */
        @NameInMap("TitleConfigs")
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListTitleConfigs> titleConfigs;

        public static DescribeConsoleMessagesResponseBodyMessageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsoleMessagesResponseBodyMessageList self = new DescribeConsoleMessagesResponseBodyMessageList();
            return TeaModel.build(map, self);
        }

        public DescribeConsoleMessagesResponseBodyMessageList setClientTypes(java.util.List<String> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<String> getClientTypes() {
            return this.clientTypes;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setContentConfigs(java.util.List<DescribeConsoleMessagesResponseBodyMessageListContentConfigs> contentConfigs) {
            this.contentConfigs = contentConfigs;
            return this;
        }
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListContentConfigs> getContentConfigs() {
            return this.contentConfigs;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setHyperLinkConfigs(java.util.List<DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs> hyperLinkConfigs) {
            this.hyperLinkConfigs = hyperLinkConfigs;
            return this;
        }
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListHyperLinkConfigs> getHyperLinkConfigs() {
            return this.hyperLinkConfigs;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setImageFilePath(String imageFilePath) {
            this.imageFilePath = imageFilePath;
            return this;
        }
        public String getImageFilePath() {
            return this.imageFilePath;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setImageInfoList(java.util.List<DescribeConsoleMessagesResponseBodyMessageListImageInfoList> imageInfoList) {
            this.imageInfoList = imageInfoList;
            return this;
        }
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListImageInfoList> getImageInfoList() {
            return this.imageInfoList;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setMessageLevel(String messageLevel) {
            this.messageLevel = messageLevel;
            return this;
        }
        public String getMessageLevel() {
            return this.messageLevel;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setMetaData(DescribeConsoleMessagesResponseBodyMessageListMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public DescribeConsoleMessagesResponseBodyMessageListMetaData getMetaData() {
            return this.metaData;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setTargetIds(String targetIds) {
            this.targetIds = targetIds;
            return this;
        }
        public String getTargetIds() {
            return this.targetIds;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeConsoleMessagesResponseBodyMessageList setTitleConfigs(java.util.List<DescribeConsoleMessagesResponseBodyMessageListTitleConfigs> titleConfigs) {
            this.titleConfigs = titleConfigs;
            return this;
        }
        public java.util.List<DescribeConsoleMessagesResponseBodyMessageListTitleConfigs> getTitleConfigs() {
            return this.titleConfigs;
        }

    }

}
